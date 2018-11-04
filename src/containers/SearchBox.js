import React, { Component } from 'react';

import Results from './ResultBox';


class SearchBox extends Component {

    constructor(props) {
        super(props)
        this.state = {
            query: '',
            results: []
        }

        this.handleInput = this.handleInput.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    getInfo = () => {
        //fetch request?
    }

    handleInput(event) {
        this.setState({ text: event.target.value })
    }

    handleSubmit(event) {
        event.preventDefault();
        console.log('form submitted');
        const text = this.state.text.trim();
        if (!text) {
            return;
        }
        // const newSearch = { text: text };

        //reset the form fields
        console.log(text);
        this.setState({ text: '' })
    }

    render() {
        return (
            <div>
                <form onSubmit={this.handleSubmit}>
                    <input
                        type="text"
                        placeholder="Search product..."
                        value={this.state.text}
                        onChange={this.handleInput}
                    />
                    <input type="submit" value="Search" />
                    <p>{this.state.query}</p>
                </form>
            
                
            </div>
        )
    }
}

export default SearchBox;