const table = document.getElementById('table')

const data = [
    {
        name: 'Juan José',
        lastName: 'Jaramillo Cajamarca',
        type: 'Teacher',
        actions: `<button class="btn btn-warning action-button">Update</button><button class="btn btn-danger action-button">Delete</button>`
    },
    {
        name: 'Juan José',
        lastName: 'Jaramillo Cajamarca',
        type: 'Teacher',
        actions: `<button class="btn btn-warning action-button">Update</button><button class="btn btn-danger action-button">Delete</button>`
    },
    {
        name: 'Juan José',
        lastName: 'Jaramillo Cajamarca',
        type: 'Teacher',
        actions: `<button class="btn btn-warning action-button">Update</button><button class="btn btn-danger action-button">Delete</button>`
    },
    {
        name: 'Juan José',
        lastName: 'Jaramillo Cajamarca',
        type: 'Teacher',
        actions: `<button class="btn btn-warning action-button">Update</button><button class="btn btn-danger action-button">Delete</button>`
    }
];

data.forEach((user) => {
    const row = table.insertRow();
    Object.keys(user).forEach((key, index) => {
        const cell = row.insertCell(index);
        cell.innerHTML = user[key];
    })
});