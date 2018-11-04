import React, { Component } from 'react';


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

        console.log('text:',text);
        this.setState({ text: '' })
    }

//     handleChange(event) {
//         const onCurrencySelected = event.target.value;
// }
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
            
                <select id='currency-seelctor' defaultValue="default">
                    <option disabled value="default">Select currency</option>
                    <option value="GBP">Pound Sterling</option>
                    <option value="USD">US Dolar</option>
                    <option value="EURO">Euro</option>
                    <option value="Yen">Japanese Yen</option>
                    <option value="Yuan">Chinese Yuan</option>
                    <option value="Real">Brazilian Real</option>
                    <option value="Rupee">Indian Rupee</option>
                    <option value="SinDollar">Singapore Dollar</option>
                    <option value="Lira">Turkish Lira</option>
                    <option value="Peso">Mexican Peso</option>
                    <option value="AUDollar">Australian Dollar</option>
                </select>
            </div>
        )
    }
}

export default SearchBox;