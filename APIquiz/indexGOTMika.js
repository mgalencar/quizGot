const app = require("express")()
const http = require("http").createServer(app);

const bodyParser = require("body-parser")


app.use(bodyParser.json());

app.use(bodyParser.urlencoded({
    extended: true
}))

//Array com os personagens --Depois vai vim do banco de dados - FORMA CORRETA: **VAI VIRRRR DO BANCO
let personagens = [{
    "id": 1,
    "nome": "Daenerys",
    "genero": "Female",
    "titulo": "Rainha dos dragões",
    "casa": "Targaryem",
    "reino": "Essos"
    },
    {
    "id": 2,
    "nome": "Jon",
    "genero": "Male",
    "titulo": "Rei do norte",
    "casa": "Stark",
    "reino": "Westeros"
    },
    {
    "id": 3,
    "nome": "Cersei",
    "genero": "Female",
    "titulo": "Rainha dos sete reinos",
    "casa": "Lannister",
    "reino": "Westeros"
    },]

    //Definindo o numero de id's cadastrados
    let idPersonagens = 3;

    //EndPoint para listar todos os personagens
    app.get("/personagens",(req,res) => res.send(personagens));

    //EndPoint para listar um personagem de acordo com o id
    app.get("/personagens/:id", (req, res) => {
        

        const personagem = personagens.filter(personagem => personagem.id == req.params.id);

        if(personagem.lenght > 0){
            res.send(personagem[0]);
        }
        else{
            res.send({});
        }
    })
    //EndPoint para inserir um novo personagem
    app.post("/novoPersonagem", (req, res) => {
    
        idPersonagens++;

        const {nome, genero, titulo, casa, reino} = req.body;

        const id = idPersonagens;

        const novoPersonagem = {id, nome, genero,titulo,casa,reino}

        personagens.push(novoPersonagem);

        res.send({ "sucesso" :true, "msg": "Personagem adicionado"});


    });
    //EndPoint para deletar um personagem
    app.get("/personagem/delete/:id", (req, res) => {
        personagens = personagens.filter(d => d.id != req.params.id)
        res.send({"Sucesso": true, "msg": "Personagem deletado com sucesso"})
    })

   
    let casas = [{
        "id": 1,
        "nome": "STARK",
        "lema": "o inverno esta chegando",
        "sede": "Winterfall",
        "simbolo": "Lobo"
    },
    {
        "id": 2,
        "nome": "LANNISTER",
        "lema": "ouça-me rugir",
        "sede": "Rochedo Castelly",
        "simbolo": "leão"
    },
    {
        "id": 3,
        "nome": "TARGERYEN",
        "lema": "fogo e sangue",
        "sede": "pedra do dragão",
        "simbolo": "dragão"
    },]

    let idCasas = 3;

    app.get("/casas",(req,res) => res.send(casas));

    app.get("/casas/:id", (req, res) =>{

        const casa = casas.filter(casa => casa.id == req.params.id);

        if(casa.length > 0){
            res.send(casa[0]);
        }else{
            res.send({});
        }
    })

    app.post("/novaCasa", (req, res) =>{

        idCasas++;

        const{nome, lema, sede, simbolo} = req.body;

        const id = idCasas;

        const novaCasa = {id, nome, lema, sede, simbolo}

        casas.push(novaCasa)

        res.send({"sucesso": true, "msg": "Casa adicionada"});
    })

    app.get("/casa/delete/:id", (req, res) => {
        casas = casas.filter(d => d.id != req.params.id)
        res.send({"sucesso": true, "msg": "Casa adicionada"})

    })

http.listen(5001, () => {
    console.log("Servidor rodando em http://localhost:5001")
})
