import React, { Component } from "react";
import {
  Collapse,
  Nav,
  Navbar,
  NavbarBrand,
  NavbarToggler,
  NavItem,
  NavLink,
} from "reactstrap";
import { Link } from "react-router-dom";

class NavBar extends Component {
  constructor(props) {
    super(props);
    this.state = { isOpen: false };
    this.toggle = this.toggle.bind(this);
  }

  toggle() {
    this.setState({
      isOpen: !this.state.isOpen,
    });
  }

  render() {
    return (
      <Navbar dark expand="md">
        <NavbarBrand tag={Link} to="/">
          Pelican Database
        </NavbarBrand>
        {/*<NavbarToggler onClick={this.toggle} />*/}
        {/*<Collapse isOpen={this.state.isOpen} navbar>*/}
        {/*  <Nav className="ml-auto" navbar>*/}
        {/*    <NavItem>*/}
        {/*      <NavLink href="/">Just an empty list</NavLink>*/}
        {/*    </NavItem>*/}
        {/*  </Nav>*/}
        {/*</Collapse>*/}
      </Navbar>
    );
  }
}

export default NavBar;
