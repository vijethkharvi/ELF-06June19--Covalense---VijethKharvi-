import React, { Component } from 'react';
import { Button, ButtonToolbar } from 'react-bootstrap';
import { Carousel } from 'react-bootstrap';
import { Navbar, NavDropdown, Nav, Form, FormControl } from 'react-bootstrap';

class Bootstrap extends Component {
    render() {
        return (
            <div>
                <Navbar bg="light" expand="lg">
                    <Navbar.Brand href="#home">React-Bootstrap</Navbar.Brand>
                    <Navbar.Toggle aria-controls="basic-navbar-nav" />
                    <Navbar.Collapse id="basic-navbar-nav">
                        <Nav className="mr-auto">
                            <Nav.Link href="#home">Home</Nav.Link>
                            <Nav.Link href="#link">Link</Nav.Link>
                            <NavDropdown title="Dropdown" id="basic-nav-dropdown">
                                <NavDropdown.Item href="#action/3.1">Action</NavDropdown.Item>
                                <NavDropdown.Item href="#action/3.2">Another action</NavDropdown.Item>
                                <NavDropdown.Item href="#action/3.3">Something</NavDropdown.Item>
                                <NavDropdown.Divider />
                                <NavDropdown.Item href="#action/3.4">Separated link</NavDropdown.Item>
                            </NavDropdown>
                        </Nav>
                        <Form inline>
                            <FormControl type="text" placeholder="Search" className="mr-sm-2" />
                            <Button variant="outline-success">Search</Button>
                        </Form>
                    </Navbar.Collapse>
                </Navbar>


                <Carousel>
                    <Carousel.Item>
                        <img
                            className="d-block w-100"
                            src="https://cdn.pixabay.com/photo/2019/07/11/07/29/strawberries-4330211__340.jpg" style={{ height: '50%' }}
                            alt="First slide"
                        />
                        <Carousel.Caption>
                            <h3>First slide label</h3>
                            <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
                        </Carousel.Caption>
                    </Carousel.Item>
                    <Carousel.Item>
                        <img
                            className="d-block w-100"
                            src="https://cdn.pixabay.com/photo/2019/07/27/17/56/london-underground-4367265__340.jpg" style={{ height: '50%' }}
                            alt="Third slide"
                        />

                        <Carousel.Caption>
                            <h3>Second slide label</h3>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                        </Carousel.Caption>
                    </Carousel.Item>
                    <Carousel.Item>
                        <img
                            className="d-block w-100"
                            src="https://cdn.pixabay.com/photo/2019/07/27/17/56/london-underground-4367265__340.jpg" style={{ height: '50%' }}
                            alt="Third slide"
                        />

                        <Carousel.Caption>
                            <h3>Third slide label</h3>
                            <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p>
                        </Carousel.Caption>
                    </Carousel.Item>
                </Carousel>

                <ButtonToolbar>
                    <Button variant="outline-primary">Primary</Button>
                    <Button variant="outline-secondary">Secondary</Button>
                    <Button variant="outline-success">Success</Button>
                    <Button variant="outline-warning">Warning</Button>
                    <Button variant="outline-danger">Danger</Button>
                    <Button variant="outline-info">Info</Button>
                    <Button variant="outline-light">Light</Button>
                    <Button variant="outline-dark">Dark</Button>
                </ButtonToolbar>



            </div >
        )
    }
}
export default Bootstrap;