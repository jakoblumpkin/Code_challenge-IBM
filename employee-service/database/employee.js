db = connect(mongodb://employeedbuser:employeedbuserpwd@cluster0-shard-00-00.8b5zs.mongodb.net:27017,cluster0-shard-00-01.8b5zs.mongodb.net:27017,cluster0-shard-00-02.8b5zs.mongodb.net:27017/test?replicaSet=atlas-14dp5p-shard-0&ssl=true&authSource=admin);
use admin
db.auth('employeedbuser', 'employeedbuserpwd')
db = db.getSiblingDB('Employee')

db.createUser({
    user: 'employeedbuser', 
    pwd: 'employeedbuserpwd', 
    roles: [
        { role: 'dbOwner', 
        db: 'Employee' }
    ] 
})
