function sendToSvr() {
    fetch('/api/sendToSvr', {
        method: 'POST',
        headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }
        }
    ).then();
    returnFromSvr();
}

function returnFromSvr() {
    fetch('/api/returnFromSvr', {
        method: 'GET',
        headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }
        }
    ).then((response) => {
            return response.text();
        }
    ).then((text) => {
            document.getElementById('number').innerText = text;
        }
    );
}