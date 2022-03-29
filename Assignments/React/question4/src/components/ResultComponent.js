import React, {Component} from 'react';

class ResultComponent extends Component {


    render() {
        let {result} = this.props;
        return (
            <div className="result">
                {/* <p>{result}</p> */}
                <form>
                    {/* <label for="result">{result}</label> */}
                    <input type="text" value={result} readOnly/>
                </form>
                
            </div>
    )
        ;
    }
}


export default ResultComponent;