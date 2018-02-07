const React = require('react');
const ReactDom = require('react-dom');
const client = require('./client');

class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            employees: []
        };
    }

    componentDidMount() {
        client({
            method: 'GET',
            path: '/api/employees'
        }).done(res => {
            const employees = res.entity._embedded.employees;

            this.setState({ employees });
        })
    }
}