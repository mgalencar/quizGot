const app = require("express")()
const http = require("http").createServer(app);

const bodyParser = require("body-parser")

const mysql = require('mysql');

app.use(bodyParser.json());

app.use(bodyParser.urlencoded({
    extended: true
}))
boolean = true;

//Definindo o numero de id's cadastrados
// let idPersonag
//EndPoint para listar todos os personagens
app.get("/personagens",(req,res) => {
    var sql = "SELECT * FROM tbl_personagens";
    executarSQL(sql, res, "SELECT");
});

//EndPoint para listar um personagem de acordo com o id
app.get("/personagem/:id", (req, res) => {
    var id = parseInt(req.params.id);
    const sql = "SELECT * FROM tbl_personagens WHERE id_personagens = " + id;
    executarSQL(sql, res, "SELECT");
	
})
//EndPoint para inserir um novo personagem
app.post("/novoPersonagem", (req, res) => {
    const nome_personagem = req.body.nome_personagem;
    const  genero = req.body.genero;
    const descricao = req.body.descricao;
    const casa = req.body.casa;
    const reino = req.body.reino;

    sql = "INSERT INTO tbl_personagens (nome_personagem, genero, descricao, casa, reino) VALUES ('"+nome_personagem+"','"+genero+"', '"+descricao+"','"+casa+"','"+reino+"')";
    executarSQL(sql, res, "INSERT");
});
//EndPoint para deletar um personagem
app.get("/personagem/delete/:id", (req, res) => {
    let id = parseInt(req.params.id);
    const sql = "DELETE FROM tbl_personagens WHERE id_personagens = " + id;
    executarSQL(sql, res);
});
app.patch("/editarPersonagem/:id", (req, res) => {
    
    const id = parseInt(req.params.id);

    const nome_personagem = req.body.nome_personagem;
    const genero = req.body.genero;
    const descricao = req.body.descricao;
    const casa = req.body.casa;
    const reino = req.body.reino;

    sql = "UPDATE tbl_personagens SET nome_personagem = '"+nome_personagem+"',genero = '"+genero+"', descricao = '"+descricao+"', casa = '"+casa+"', reino = '"+reino+"' WHERE id_personagens = "+ id;

    executarSQL(sql, res);

    //res.send({ "sucesso" :true, "msg": "Personagem adicionado"});
});

// END POINTS CASAS

app.get("/casas",(req,res) => {
    var sql = "SELECT * FROM tbl_casas";
    executarSQL(sql, res, "SELECT");
});

//EndPoint para listar um personagem de acordo com o id
app.get("/casa/:id", (req, res) => {
    var id = parseInt(req.params.id);
    const sql = "SELECT * FROM tbl_casas WHERE id_casas = " + id;
    executarSQL(sql, res, "SELECT");
	
})



//FUNÇÃO PARA EXECUTAR TODOS OS SQL
function executarSQL(sql, res, modo){
    
    //ABRINDO CONEXÃO COM O BANCO DE DADOS
    const con = mysql.createConnection({
        host: "127.0.0.1",
        user: "root",
        password: "Senai@127131",
        database: "db_quiz_got"
    });
    
    //RODANDO A VARIAVEL SQL NA QUERY 
    con.query(sql, function (erro, result, field){
        if(erro)
            res.send(erro);
        else
			if(modo == "SELECT"){
				res.send(result);
				console.log(result);
			}
			else if(modo == "INSERT"){
				res.send({ "sucesso" :true, "msg": "Personagem adicionado"});
			}
    });
    return boolean;
}
//pegando conexao na porta 5001
http.listen(5001, () => {
    console.log("Servidor rodando na porta 5001")
})
