import React, { Component } from 'react';
import Papa from 'papaparse'
class Uploader extends Component {

   constructor(props) {
    super(props);
    this.state = {value: ''};

    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(event) {
  	console.log(event.target.files[0]);
    	Papa.parse(event.target.files[0], {
    header: true,		
	complete: function(results) {
		console.log("Finished:", results.data);
	}
});
    this.setState({value: event.target.value});
  }

  handleSubmit(event) {
  	 	fetch('http://localhost:8080/api/add/trips', {
      method: 'POST',
      mode: 'no-cors',
      body: this.state.value,
    }).then((response) => {
      // response.json()
      response.json().then((body) => {
       console.log(response)
      });
    }).then(data => console.log(data));
    event.preventDefault();
  }
   
    render() {
        return (
<form onSubmit={this.handleSubmit}>
        <label>
          Name:
          <input type="file" value={this.state.value} onChange={this.handleChange} />
        </label>
        <input type="submit" value="Submit" />
      </form>
        );
    }
}

export default Uploader;
