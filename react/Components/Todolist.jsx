
import React,{ Component } from 'react';
class TodoList extends Component{
  componentDidUpdate(){
    this.props.inputElement.current.focus()
  }
  constructor(){
    super()
  
  }
  render(){
    return(
      <div className="todoListMain" >
        <div className="header">
        <form onSubmit={this.props.addItem}>
          <input style={{backgroundColor:this.props.color}} placeholder="task"
          ref={this.props.inputElement}
          value={this.props.currentItem.text}
          onChange={this.props.handleInput}
            />
          <button style={{color:"red"}} type="submit">Add Task</button>
        </form>
        </div>
      </div>
    )
  }
}
export default TodoList;
