db = connect("mongodb://employeedbuser:employeedbuserpwd@cluster0-shard-00-00.8b5zs.mongodb.net:27017,cluster0-shard-00-01.8b5zs.mongodb.net:27017,cluster0-shard-00-02.8b5zs.mongodb.net:27017/test?replicaSet=atlas-14dp5p-shard-0&ssl=true&authSource=admin");

use Employee
db.auth('employeedbuser', 'employeedbuserpwd')

db.Employee.insertOne({"userId": "USER100", "firstName": "Jakob", "lastName": "Lumpkin", "address": "123 main street", "state": "texas" , "zip": "12345", "cellPhone": "346-909-9123", "homePhone": "301-222-0123", "email": "john@hotmail.com"})