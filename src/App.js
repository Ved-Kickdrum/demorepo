import React, { Component } from 'react';
import './App.css';
import MyBanner from './MyBanner';

class App extends Component {

  render() {

    const myAddress = {
      message: 'Try It Yourself'
    };

    return (
      <div>
        <MyBanner
          name="CodeBuild Demo"
          address={myAddress}
        />
      </div>
    );
  }
}

export default App;
