const table = document.getElementById('table')

const data = [
    {
        name: 'Club de Software EPN',
        actions: `
        <button class="btn btn-warning action-button">
            <a href="update-department.html">
                Update
            </a>
        </button>
        <button class="btn btn-danger action-button">
            <a href="delete-department.html">
                Delete
            </a>
        </button>`
    },
    {
        name: 'Club de Software EPN',
        actions: `<button class="btn btn-warning action-button">Update</button><button class="btn btn-danger action-button">Delete</button>`
    },
    {
        name: 'Club de Software EPN',
        actions: `<button class="btn btn-warning action-button">Update</button><button class="btn btn-danger action-button">Delete</button>`
    },
    {
        name: 'Club de Software EPN',
        actions: `<button class="btn btn-warning action-button">Update</button><button class="btn btn-danger action-button">Delete</button>`
    },
];

data.forEach((user) => {
    const row = table.insertRow();
    Object.keys(user).forEach((key, index) => {
        const cell = row.insertCell(index);
        cell.innerHTML = user[key];
    })
});