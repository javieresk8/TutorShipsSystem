const table = document.getElementById('table')

const data = [
    {
        day: 'Monday',
        hour: '9:00 - 9:15',
        info: `<span class="badge badge-pill badge-success">Available</span>`,
        action: `<a href="new-tutorship-confirmation.html"><button class="btn btn-sm btn-success">Select</button></a>`
    },
    {
        day: 'Monday',
        hour: '9:00 - 9:15',
        info: `<span class="badge badge-pill badge-danger">Reserved</span>`,
        action: `N/A`
    }
];

data.forEach((user) => {
    const row = table.insertRow();
    Object.keys(user).forEach((key, index) => {
        const cell = row.insertCell(index);
        cell.innerHTML = user[key];
    })
});