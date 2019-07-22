const hoursInput = document.getElementById('hours')
const minutesInput = document.getElementById('minutes')
const secondsInput = document.getElementById('seconds')
const startButton = document.getElementById('start')
const pauseButton = document.getElementById('pause')
const resetButton = document.getElementById('reset')

const pad = v => `00${v}`.slice(-2)

// Functions that compute units from a millisecond value
const hours = m => Math.floor((m / 3600000) % 24)
const minutes = m => Math.floor((m / 60000) % 60)
const seconds = m => Math.floor((m / 1000) % 60)

// Render function
const render = v => {
    hoursInput.value = pad(hours(v))
    minutesInput.value = pad(minutes(v))
    secondsInput.value = pad(seconds(v))
}

// This is the value you ask from the user
const duration = 3610000

let remaining = duration
let timer = null
let end = 0

startButton.addEventListener('click', e => {
    if (timer) return

    // Get end timestamp based on current time + remaining time
    end = Date.now() + remaining

    // Render the remaining time every 16ms (approx 60fps)
    timer = setInterval(() => {
        render(end - Date.now())
    }, 16)
})

pauseButton.addEventListener('click', e => {
    // Do nothing if timer not running
    if (!timer) return

    // Otherwise, clear timer
    clearInterval(timer)
    timer = null

    // Note the remaining time
    remaining = end - Date.now()
    render(remaining)
})

resetButton.addEventListener('click', e => {
    // Do nothing if timer not running
    if (!timer) return

    // Otherwise, clear timer
    clearInterval(timer)
    timer = null

    // Reset remaining to original duration
    remaining = duration
    render(remaining)
})

render(remaining)