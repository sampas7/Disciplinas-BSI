const express = require('express')

const clientsRoutes = require("./route/client.js")
const productRoutes = require("./routes/products")

const PORT = 3000

const app = express()

app.use(express.json())

app.use("/clientes", clientsRoutes)
app.use("/produtos", productRoutes)


app.use("/", (req, res) => {
    return res.send("API de gerenciamento de Compras.")
})

app.listen(PORT, () => {
    console.log("Server listening in port " + PORT)
})