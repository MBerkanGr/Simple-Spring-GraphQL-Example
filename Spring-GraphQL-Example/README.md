> **GraphiQL Path** : http://localhost:8090/graphiql


#### GetById
```
query {
    getById(id: "1")
    {
        id,
        brandName
    }
}
```

#### GetVehicleList
```
query {
   getVehicleList(type:"Y")
   {
        id,
        brandName,
        launchDate
   }
}
```

#### CreateVehicle
```
mutation {
    createVehicle(vehicle: {type:"Y", modelCode:"testModel", brandName: "testName"})
    {
        id,
        brandName,
        launchDate
    }
}
```
