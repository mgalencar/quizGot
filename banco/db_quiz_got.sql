-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: db_quiz_got
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbl_casas`
--

DROP TABLE IF EXISTS `tbl_casas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_casas` (
  `id_casas` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `membros` int(11) NOT NULL,
  `sede` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `regiao` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `lema` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `descricao` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `foto_casa` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_casas`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_casas`
--

LOCK TABLES `tbl_casas` WRITE;
/*!40000 ALTER TABLE `tbl_casas` DISABLE KEYS */;
INSERT INTO `tbl_casas` VALUES (1,'STARK',112,'Winterfell','Norte','O Inverno está chegando','A Casa Stark de Winterfell é uma das Grandes Casas de Westeros e a principal casa nobre do Norte. Em tempos antigos, eles reinaram como Reis do Inverno, mas desde a Guerra da Conquista tem servido como Protetores do Norte para o Trono de Ferro, enquanto conservam seu título de lordes. Seu assento de poder é Winterfell, uma fortaleza antiga, renomada por sua força. Seu símbolo é um lobo gigante correndo através de um campo branco. Seu lema é \"O inverno está chegando\", sendo uma das poucas casas nobres de Westeros que tem como seu lema não palavras de \'encorajamento\' mas sim um \'aviso\'. Além dos Karstarks de Karhold, os Starks de Winterfell tem vários outros parentes distantes pelo Norte, provavelmente em Porto Branco e Vila Acidentada, por exemplo.','casas/1.png'),(2,'ARRYN',32,'Ninho da Águia','Vale','Tão Alto Como a Honra','Casa Arryn do Ninho da Águia é uma das Grandes Casas de Westeros, e a principal casa nobre do Vale. Sua sede principal é o Ninho da Águia, mas possuem outras moradas, incluindo o castelo de inverno nos Portões da Lua. Ambas as fortificações se situam na Lança do Gigante, a montanha mais alta do Vale, e o Ninho da Águia é considerado inexpugnável. Seu símbolo é um falcão e um quarto crescente, brancos em um campo azul-celeste, e suas palavras são \"Tão Alto Como a Honra\". Sua linhagem data dos velhos Ândalos que invadiram Westeros. Normalmente se casando com outros nobres Ândalos, a Casa Arryn tem atualmente a mais pura ascendência da nobreza Ândala.','casas/2.png'),(3,'TARGARYEN',215,'Fortaleza Vermelha','Porto Real','Fogo e Sangue','A Casa Targaryen é uma família nobre, descendentes da velha Valíria, que, por quase trezentos anos, governou os Sete Reinos de Westeros. O símbolo Targaryen é um dragão vermelho de três cabeças cuspindo fogo num fundo preto. Eles eram uma das famílias conhecidas como Senhores de dragões que regiam o Império Valiriano.[6] Alguns anos antes da Perdição de Valíria, os Targaryens abandonaram seu lar em Essos e se assentaram em Pedra do Dragão, uma antiga fortaleza valiriana na costa de Westeros. Lá eles residiram por mais de um século, até que Aegon, o Conquistador e suas irmãs-esposas, Visenya e Rhaenys, iniciaram a Guerra da Conquista.','casas/3.png'),(4,'LANNISTER',91,'Rochedo Casterly','Terras Ocidentais','Ouça-me Rugir','A Casa Lannister de Rochedo Casterly é uma das grandes casas nobres dos Sete Reinos e a maior, mais poderosa e importante das Terras Ocidentais. Seu assento de poder é a fortaleza de Rochedo Casterly, embora um ramo menor da casa exista na cidade de Lannisporto. Seu símbolo é um leão dourado em um campo carmesim. Contudo, um lema não-oficial, mas igualmente bem conhecido, é \"Um Lannister sempre paga suas dívidas.\". Bonitos, altos, de cabelo dourado e olhos verde-esmeralda, os Lannisters tem sangue de aventureiros de Ândalos que criaram um poderoso império no oeste, entre as colinas e os vales. Através da linhagem feminina, eles descendem de Lann, o Esperto, uma figura lendária da Era dos Heróis, que enganou os membros da Casa Casterly, roubando seu principal castelo, ainda durante a era dos Primeiros Homens.','casas/4.png'),(5,'FREY',141,'As Gemêas','Terras Fluviais','Não mencionado nos livros','A Casa Frey da Travessia é uma casa nobre das Terras Fluviais. Sua principal sede fica nas Gêmeas, um par de castelos em cada margem do Ramo Verde do Tridente, que serve como uma ponte vital. O Lorde da casa é chamado de Senhor da Travessia. A localização estratégica das Gêmeas permitiu à família enriquecer bastante. Sob o controle do atual Lorde, Walder Frey, cresceram muito em tamanho e poder. A Casa pode reunir mil cavaleiros e três mil soldados.','casas/5.png'),(6,'GREYJOY',36,'Pyke','Ilhas de Ferro','Nós Não Semeamos','A Casa Greyjoy descende do Rei Cinzento, uma figura lendária da Era dos Heróis. Casa Greyjoy de Pyke é uma das Grandes Casas de Westeros. Governa sobre as Ilhas de Ferro, uma coletânea pedregosa e sombria de ilhas na costa oeste de Westeros, do castelo e ilha de Pyke','casas/6.png'),(7,'BOLTON',20,'Forte do Pavor','Norte','Nossas Lâminas são Afiadas','Os Boltons são uma antiga e poderosa casa nobre do Norte que governou suas terras como Reis Vermelhos a partir do seu castelo do Forte do Pavor. Seus domínios incluíam as regiões que se estendiam do Rio Último até a Faca Branca e até as Colinas Cabeça de Carneiro. Foi sugerido no passado que o lendário Rei da Noite era um Bolton.','casas/7.png'),(8,'TARLY',10,'Monte Chifre','Campina','Primeiros em Batalha','A Casa Tarly de Monte Chifre é uma casa nobre da Campina juramentada à Casa Tyrell. Suas terras são localizadas nos sopés das Montanhas Vermelhas de Dorne. Seu brasão ostenta um caçador armado em campo verde. Seu lema não é revelado nos livros, mas de acordo com uma fonte semi-oficial é \"Primeiros em Batalha\". Eles são uma família antiga em honra com terras ricas e uma forte fortaleza. São também os proprietários de uma espada de aço Valiriano chamada Veneno do Coração.','casas/8.png'),(9,'TYRELL',57,'Jardim de Cima','Campina','Crescendo Fortes','Casa Tyrell de Jardim de Cima é uma das Grandes Casas dos Sete Reinos, senhores supremos da Campina. Uma grande e rica casa, sua riqueza é apenas superada entre as Grandes Casas pela Casa Lannister, os Tyrell porém possuem a maior força militar. Jardim de Cima é uma antiga sede de governo e coração da cavalaria nos Sete Reinos; os Tyrell chamam a si mesmo \'Defensores das Marcas\' e \'Supremos Marechais da Campina\', e possuem tradicionalmente o título de Protetor do Sul. Seu brasão ostenta uma rosa dourada em campo verde-relva, e suas palavras são \"Crescendo Fortes\". Membros da família tendem a apresentar cabelos encaracolados castanhos e olhos castanhos ou dourados.','casas/9.png'),(10,'BARATHEON',55,'Ponta Tempestade','As Terras da Tempestade','Nossa é a Fúria','A Casa Baratheon de Ponta Tempestade, é uma das Grande Casas de Westeros e é a principal casa das Terras da Tempestade. Sua sede é em Ponta Tempestade, um castelo antigo construído pelos Reis da Tempestade. Seu brasão é um veado coroado negro num fundo dourado.?[1] Os membros da família tendem a ser grandes, com cabelo preto e olhos azuis. Eles são conhecidos por seus temperamentos vivos.','casas/10.png');
/*!40000 ALTER TABLE `tbl_casas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_personagens`
--

DROP TABLE IF EXISTS `tbl_personagens`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_personagens` (
  `id_personagens` int(11) NOT NULL AUTO_INCREMENT,
  `nome_personagem` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `genero` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `descricao` text NOT NULL,
  `casa` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `reino` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `foto_personagem` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id_personagens`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_personagens`
--

LOCK TABLES `tbl_personagens` WRITE;
/*!40000 ALTER TABLE `tbl_personagens` DISABLE KEYS */;
INSERT INTO `tbl_personagens` VALUES (33,'Daenerys Targaryen','Feminino','Daenerys foi considerada pelo jornal “The New York Times” uma das melhores criações de George R. R. Martin, autor dos livros que inspiraram a série. ','Targaryen','Essos/Westeros','personagens/1.png'),(34,'Jon Snow','Masculino','Jon Snow é o filho bastardo de Eddard Stark com uma mãe de identidade desconhecida. Quando completa maioridade, ele se junta à Patrulha da Noite, cujos próprios comandados o matam algum tempo depois. Eles acreditavam que Snow havia traído seu juramento. A morte do personagem dura pouco, e ele é ressuscitado. Reviravoltas envolvendo as suas verdadeiras origens, e um relacionamento amoroso inesperado, o marcam ainda mais. Na série é interpretado pelo ator Kit Harington.','Targaryen','Westeros','personagens/2.jpg'),(35,'Tyrion Lannister','Masculino','Também chamado de duende ou meio-homem, Tyrion Lannister é o terceiro e mais novo filho de Tywin Lannister e Joanna Lannister. O pai o despreza por ele ser anão, e também porque a mãe morreu durante seu parto. Embora seja cruel com seus inimigos, ele apresenta empatia com as pessoas próximas e as minorias. Educado, calculista e perspicaz, Tyrion é um dos fortes personagens da trama. Na série Tyrion é interpretado por Peter Dinklage.','Lannister','Westeros','personagens/3.jpg'),(36,'Sansa Stark','Feminino','Sansa Stark é meia-irmã de Jon Snow, a filha mais velha de Catelyn e Eddard Stark. Criada para ser uma dama, ela é treinada para deveres femininos, como bordado, ','Stark','Westeros','personagens/4.jpg'),(37,'Cersei Lannister','Feminino','Cersei Lannister é a filha mais velha de Lorde Tywin Lannister e irmã gêmea de Jaime Lannister. Ela se casa com o rei Robert Baratheon e se torna a rainha dos Sete Reinos. A principal característica da personagem é seu temperamento explosivo e o orgulho ferido. A ira e a mágoa a fazem tomar decisões precipitadas frequentemente. Apesar de conseguir ascender ao poder facilmente, ela não consegue lidar da melhor maneira com ele. Na série é interpretada pela atriz Lena Headey','Lannister','Westeros','personagens/5.jpg'),(38,'Joffrey Baratheon','Masculino','Joffrey acredita ser o filho mais velho e herdeiro do Rei Robert I e da Rainha Cersei Lannister. No entanto, o seu verdadeiro pai é Jaime Lannister, irmão da rainha. Ele possui o mesmo comportamento incontrolável e os impulsos sádicos de sua mãe. Prometido a Sansa Stark, ele a maltrata e faz com que a garota perca a sua visão romântica do mundo.  Na série foi interpretado pelo ator Jack Gleeson','Baratheon/Lannister','Westeros','personagens/6.jpg'),(39,'Eddard Stark','Masculino','Conhecido como Ned, Eddard Stark é o chefe da casa Stark, Senhor de Winterfell, e Protetor do Norte. Ele é conhecido por seu senso de justiça. Enquanto a sua família o considera bondoso, muitos encaram a sua personalidade reservada como um sinal de frieza e desdém. Stark é o melhor amigo do Rei Robert Baratheon, com quem foi criado e a quem ajudou a conquistar o Trono de Ferro. Na série, foi interpretado pelo ator Sean Bean','Stark','Westeros','personagens/7.jpg'),(40,'Brienne de Tarth','Feminino','Brienne de Tarth surgiu como uma personagem secundária, mas ganhou destaque nas temporadas 4, 5, 6 e 7. Guerreira da Casa Tarth, ela é a única filha sobrevivente de Selwyn Tarth. Os gostos que desenvolveu por artes marciais quando criança fizeram dela uma exímia guerreia. Ela promete a Catelyn proteger Arya e Sansa, o que encara como a sua nova missão. Na série é interpretada pela atriz Gwendoline Christie','Tarth','Westeros','personagens/8.jpg'),(41,'Arya Stark','Feminino','A Terceira filha do Lorde Eddard Stark e Catelyn Stark, Arya é corajosa e apresenta bastante interesse em combates. Incentivada por seu meio-irmão, Jon Snow, ela aprende a lutar com espadas na pré-adolescência, e é muitas vezes confundida com um garoto. Na série ela é vivida pela atriz Maisie Williams. Embora seja o primeiro papel profissional da jovem, ela é bastante elogiada pela crítica. É interpretada nas telas pela atriz britânica Maisie Williams.','Stark','Westeros','personagens/9.jpg'),(42,'Ramsay Bolton','Masculino','Ramsay Bolton é o filho mais velho de Roose Bolton, Lorde de Dreadfort, uma fortaleza ancestral no Norte de Westeros. O personagem é um verdadeiro psicopata, que se diverte em torturar e esfolar suas vítimas. Ele é citado durante a segunda temporada da série, mas só aparece na terceira, quando é mencionado apenas como “Menino”. A sua identidade é revelada apenas no último episódio da temporada. Na série é interpretado pelo ator Iwan Rheon.','Bolton','Westeros','personagens/10.jpg'),(43,'Samwell Tarly','Masculino','Samwell Tarly é o filho mais velho do Lorde Randyll Tarly de Monte Chifre, um vassalo dos Tyrell de Jardim de Cima.  Muito inteligente e atencioso, porém timido e inseguro. Se torna um irmão juramentado da Patrulha da Noite. Na série de televisão é interpretado pelo ator John Bradley','Tully','Westeros','personagens/11.png'),(44,'Hodor','Masculino','Depois da queda de Bran Stark, ele precisa de uma maneira de se mover sobre o castelo.Hodor tem servido como forma de transporte de Bran desde então. Hodor possui mais de dois metros e dez centímetros de altura. É sugerido por Osha que seu grande tamanho seja resultado de sangue de gigantes. Seu nome verdadeiro é Walder. No seriado  é interpretado pelo ator Kristian Nairn.','Indefinida','Westeros','personagens/12.jpg'),(45,'Clegane','Masculino','Sandor Clegane, conhecido como \"Cão de Caça\" por sua natureza feroz, sua obediência sem questionamentos a seus senhores e pelos três cães existentes no brasão de armas de sua família, é um vassalo e aliado da Casa Lannister e o irmão mais novo de Gregor Clegane, o \"Montanha\". É considerado um dos melhores personagens, ja que sua habilidade formal de criar frases incriveis, vem e vai conquistando muitos fãs pelo mundo. Na série é interpretado pelo ator Rory McCann.','Clegane','Westeros','personagens/13.jpg'),(46,'Melisandre','Feminino','Ela é uma sacerdotisa do deus vermelho R\'hllor e uma conselheira íntima de Stannis Baratheon em sua campanha pelo Trono de Ferro. Frequentemente ela é chamada de Mulher Vermelha por causa da cor de seus cabelos e de suas roupas. Melisandre é original de Asshai, no continente de Essos, e veio a Westeros para propagar sua fé no Deus Vermelho. Na série é interpretada pela atriz holandesa Carice Van Houten.','Indefinida','Essos','personagens/14.jpg'),(47,'Bran Stark','Masculino','Brandon \"Bran\" Stark é o segundo filho homem das cinco crianças de Catelyn e Eddard \"Ned\" Stark. Com seus sonhos de se tornar um cavaleiro destruídos pela tentativa contra sua vida que o deixou fisicamente incapacitado, a necessidade e o dever o forçam a superar suas atuais limitações e desenvolver suas novas habilidades. Sua aceitação gradual de seus sonhos que parecem proféticos e sua habilidade para se incorporar em seu lobo \"Summer\", mostram sua maturidade e seu valor depois da perda do movimento de suas pernas. Na série é interpretado pelo ator britânico Isaac Hempstead Wright.','Stark','Westeros','personagens/15.jpg'),(48,'Petyr Baelish','Masculino','Um nobre do continente de Westeros, é o principal articulador e manipulador das novelas, responsável pelas grandes intrigas da história e dono de diversos bordéis, que usa para colher informações de seus amigos e inimigos. Seu apelido lhe foi dado por sua baixa estatura e pelas terras de sua família no menor dos Fingers, uma região costeira no Vale de Arryn. Na série é interpretado pelo ator irlandês Aidan Gillen.','Baelish','Westeros','personagens/16.jpg'),(49,'Khal Drogo','Masculino','Khal Drogo era um rico e poderoso chefe dothraki ou khal, filho de Bharbo. Antes dos trinta, Drogo já liderava o maior khalasar no Mar Dothraki, com quarenta mil guerreiros, e nunca tinha sido derrotado.  Ele se casou com Daenerys Targaryen, prometendo invadir Westeros em seu nome, mas morreu antes mesmo da invasão começar. Na série de televisão foi interpretado pelo ator Jason Momoa.','Dothraki','Essos','personagens/17.jpg'),(50,'Renly Baratheon','Masculino','Renly Baratheon era o irmão mais novo de Robert Baratheon e de Stannis Baratheon, todos filhos de Steffon Baratheon com Cassana Estermont. Com a ascensão de Robert como Rei dos Sete Reinos, Renly tornou-se Lorde de Ponta Tempestade, além de servir no pequeno conselho como mestre das leis. Após a morte de Robert ele se declarou rei e casou-se com Margaery Tyrell, conseguindo o apoio de várias casas em sua pretensão. Na série de televisão é interpretado pelo ator Gethin Anthony.','Baratheon','Westeros','personagens/18.jpg'),(51,'Sir Jorah','Masculino','Unico filho de Lorde Jeor Mormont, o Lorde da Ilha dos Urso. No passado Jorah casou-se com uma dama da Casa Glover, que morreu depois dez anos de casados. Jorah lutou ao lado do rei Robert Baratheon durante a Rebelião dos Greyjoy. Passou a viver entre as Cidades Livres após ser expulso de Westeros por Ned Stark e traido pela segunda esposa. Ofereceu seus serviços de mercenário a quem melhor pagasse até encontrar Daenerys Targaryen. Na série de televisão ele é interpretado pelo ator escocês Iain Glen.','Mormont','Essos','personagens/19.jpg'),(52,'Daario Naharis','Masculino','Daario é um guerreiro natural de Essos, comandante dos Corvos Tormentosos, uma companhia de mercenários formada por 500 soldados a cavalo. Um matador eficiente e inteiramente devotado a Daenerys Targaryen. Foi interpretado pelo ator britânico Ed Skrein e atualmente pelo ator holandês Michiel Huisman.','Corvos Tormentosos ','Essos','personagens/20.jpg'),(53,'Gilly','Feminino','Ela é uma Selvagem, povo que vive Além da Muralha do continente de Westeros e que chama a si próprio de Povo Livre. Filha e esposa de Craster, um Selvagem que casa e tem filhos com suas próprias filhas e o caso amoroso de Samwell Tarly. Ela é a mãe e meia-irmã de Sam, nome dado em homenagem a Samwell, um bebê que teve com o pai numa relação forçada. Na série de tv ela é interpretada pela atriz inglesa Hannah Murray.','Primeiros Homens','Westeros','personagens/21.jpg'),(54,'Tormund Giantsbane','Masculino','Um Selvagem do norte do continente de Westeros, assume a liderança de seu povo depois da morte do antigo líder e passa a crer que o \"Guerreiro Prometido\" é seu antigo inimigo Jon Snow. Um guerreiro com capacidade de liderança e lutador, ele demonstra suas habilidades quando mata vários patrulheiros da Muralha, dominando inclusive o mestre de armas Alliser Thorne num combate, durante a Batalha de Castle Black. Na série de televisão ele é interpretado pelo ator norueguês Kristofer Hivju.','Povo Livre','Westeros','personagens/22.jpg');
/*!40000 ALTER TABLE `tbl_personagens` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'db_quiz_got'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-10  4:47:35
