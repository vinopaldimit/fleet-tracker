import React, { Component } from 'react';
import Papa from 'papaparse'
class Uploader extends Component {

   constructor(props) {
    super(props);
    this.state = {value: ''};

    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  setDataValue = ( results ) => {
    this.setState({value: results})
  }

  handleChange(event) {
    const that = this
    Papa.parse(event.target.files[0], {
      header: true,
      complete: function(results) {
        that.setDataValue(results.data)
        console.log("Finished:", results.data)
      }
    })
  }

  handleSubmit(event) {

  	fetch('http://localhost:8080/api/add/trips', {
      method: 'POST',
      mode: 'no-cors',
      body: JSON.stringify(this.state.value[0]),
    }).then((response) => {
      console.log(this.state.value[0])
      console.log(response)
      return response.text()
    }).then(data => console.log(data));
    event.preventDefault();
  }
   
  render() {
    return (
      <form onSubmit={this.handleSubmit}>
        <label>
          Name:
          <input type="file" onChange={this.handleChange}  />
        </label>
        <input type="submit" value="Submit" />
      </form>
    )
  }
}

export default Uploader;
