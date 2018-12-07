import React, { Component } from 'react';
import BarChartComponent from './BarChartComponent';
import HorizontalBarChartComponent from './HorizontalBarChartComponent';
import PieChartComponent from './PieChartComponent';
import LineChartComponent from './LineChartComponent';

class Dashboard extends Component {

constructor (props) {
	super(props)
}


    render() {
        return (<div>
                <section className="wrapper">
                          <figure className="box a">
                          <h1>BarChart</h1>
                            <BarChartComponent />
                          </figure>
                          <figure className="box b">  
                          <h1>PieChart</h1>
                            <PieChartComponent />
                          </figure>
                           <figure className="box c"> 
                          <h1>LineChart</h1>
                            <LineChartComponent />
                          </figure>  
                          <figure className="box d">  
                           <h1>Horizontal BarChart</h1>
                            <HorizontalBarChartComponent />
                          </figure> 
                      </section> 
            </div>);
    }
}

export default Dashboard;