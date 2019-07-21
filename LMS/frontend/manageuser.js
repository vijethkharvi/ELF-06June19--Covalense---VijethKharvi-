import React from 'react';
import MaterialTable from 'material-table';

export function MaterialTableDemo() {
  const [state, setState] = React.useState({
    columns: [
      { title: 'User Name', field: 'UserName' },
      { title: 'Email Id', field: 'EmailId' },
      { title: 'Role', field: 'Role',lookup: { 2: 'librarian', 1: 'User' }},
      {title: 'Contact Number',field: 'ContactNumber',type: 'numeric'},
      {title: 'Contact Address',field: 'ContactAddress'},
      {title: 'Password',field: 'Password'},
    ],
    data: [
      /* { UserName: 'Mehmet', EmailId: 'Baran', Role: 'user', ContactNumber: 63 },
      {
        UserName: 'Zerya Betül',EmailId: 'Baran',Role: 'user',ContactNumber: 34,}, */
    ],
  });

  return (
    <MaterialTable
      title="Editable Example"
      columns={state.columns}
      data={state.data}
      editable={{
        onRowAdd: newData =>
          new Promise(resolve => {
            setTimeout(() => {
              resolve();
              const data = [...state.data];
              data.push(newData);
              setState({ ...state, data });
            }, 600);
          }),
        onRowUpdate: (newData, oldData) =>
          new Promise(resolve => {
            setTimeout(() => {
              resolve();
              const data = [...state.data];
              data[data.indexOf(oldData)] = newData;
              setState({ ...state, data });
            }, 600);
          }),
        onRowDelete: oldData =>
          new Promise(resolve => {
            setTimeout(() => {
              resolve();
              const data = [...state.data];
              data.splice(data.indexOf(oldData), 1);
              setState({ ...state, data });
            }, 600);
          }),
      }}
    />
  );
}
export default MaterialTableDemo
