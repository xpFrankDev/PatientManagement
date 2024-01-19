/*
 
 Source Server         : NothingHere
 Source Server Type    : MySQL
 Source Server Version : 100431 (10.4.31-MariaDB)
 Source Schema         : yourNameSchema

 Target Server Type    : MySQL
 Target Server Version : 100431 (10.4.31-MariaDB)
 File Encoding         : 65001

*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for accionespaciente
-- ----------------------------
DROP TABLE IF EXISTS `accionespaciente`;
CREATE TABLE `accionespaciente`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `valor` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `idPaciente` int NULL DEFAULT NULL,
  `idTerapeuta` int NULL DEFAULT NULL,
  `estado` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'Activo',
  `fecha` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cargo
-- ----------------------------
DROP TABLE IF EXISTS `cargo`;
CREATE TABLE `cargo`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `valor` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `estado` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'Activo',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for condicionmigratoria
-- ----------------------------
DROP TABLE IF EXISTS `condicionmigratoria`;
CREATE TABLE `condicionmigratoria`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `valor` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `estado` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'Activo',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for departamento
-- ----------------------------
DROP TABLE IF EXISTS `departamento`;
CREATE TABLE `departamento`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `idPadre` int NULL DEFAULT NULL,
  `valor` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `tipo` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `estado` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'Activo',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2299 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for derivaciones
-- ----------------------------
DROP TABLE IF EXISTS `derivaciones`;
CREATE TABLE `derivaciones`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `valor` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `estado` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'Activo',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for distrito
-- ----------------------------
DROP TABLE IF EXISTS `distrito`;
CREATE TABLE `distrito`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `valor` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `idProvincia` int NULL DEFAULT NULL,
  `estado` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'Activo',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for genero
-- ----------------------------
DROP TABLE IF EXISTS `genero`;
CREATE TABLE `genero`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `valor` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `estado` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'Activo',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for grupovulnerable
-- ----------------------------
DROP TABLE IF EXISTS `grupovulnerable`;
CREATE TABLE `grupovulnerable`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `valor` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `estado` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'Activo',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for indicebienestar
-- ----------------------------
DROP TABLE IF EXISTS `indicebienestar`;
CREATE TABLE `indicebienestar`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `idPaciente` int NULL DEFAULT NULL,
  `idUsuario` int NULL DEFAULT NULL,
  `fecha` date NULL DEFAULT NULL,
  `observacion` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sumatoria` int NULL DEFAULT NULL,
  `q1` int NULL DEFAULT NULL,
  `q2` int NULL DEFAULT NULL,
  `q3` int NULL DEFAULT NULL,
  `q4` int NULL DEFAULT NULL,
  `q5` int NULL DEFAULT NULL,
  `estado` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for listaespera
-- ----------------------------
DROP TABLE IF EXISTS `listaespera`;
CREATE TABLE `listaespera`  (
  `idLista` int NOT NULL AUTO_INCREMENT,
  `idPaciente` int NULL DEFAULT NULL,
  `idTrabajadorSocial` int NULL DEFAULT NULL,
  `fechaModificacion` datetime NULL DEFAULT NULL,
  `usuarioModificacion` int NULL DEFAULT NULL,
  `estado` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'Activo',
  PRIMARY KEY (`idLista`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for niveleducativo
-- ----------------------------
DROP TABLE IF EXISTS `niveleducativo`;
CREATE TABLE `niveleducativo`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `valor` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `estado` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'Activo',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for notaevolucion
-- ----------------------------
DROP TABLE IF EXISTS `notaevolucion`;
CREATE TABLE `notaevolucion`  (
  `idNota` int NOT NULL AUTO_INCREMENT,
  `idPacienteNota` int NULL DEFAULT NULL,
  `idTerapeutaNota` int NULL DEFAULT NULL,
  `fechaNota` date NULL DEFAULT NULL,
  `observacionNota` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sintomas` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `relaciones` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `limites` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Ansiedad` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `manejoAgresion` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `funcionalidad` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `trabajoTerapeutico` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `estadoNota` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'Activo',
  PRIMARY KEY (`idNota`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for obspaciente
-- ----------------------------
DROP TABLE IF EXISTS `obspaciente`;
CREATE TABLE `obspaciente`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `valor` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `idPaciente` int NULL DEFAULT NULL,
  `idTerapeuta` int NULL DEFAULT NULL,
  `fecha` date NULL DEFAULT NULL,
  `estado` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'Activo',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for paciente
-- ----------------------------
DROP TABLE IF EXISTS `paciente`;
CREATE TABLE `paciente`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `idTerapeutaAsignado` int NULL DEFAULT NULL,
  `codigo` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `nombres` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `apellidos` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `tipoDocumento` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dni` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `genero` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `fechaCreacion` date NULL DEFAULT NULL,
  `fechaNacimiento` date NULL DEFAULT NULL,
  `totalSesiones` int NULL DEFAULT NULL,
  `telefono` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `telefonoOpcional` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `correo` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `nacionalidad` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `condicionMigratoria` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `departamento` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `provincia` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `distrito` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `grupoVulnerable` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `discapacidad` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `redSoporte` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `nombreRedSoporte` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `srqIngreso` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '-1',
  `observacion` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `proyecto` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `motivoConsulta` varchar(5000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `acciones` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `modalidad` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `detalleDerivado` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'sin detalle',
  `detalleOtroTelefono` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'sin detalle',
  `contactoRedSoporte` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'sin contacto',
  `cantidadGrupoFamiliar` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT ' ',
  `rbSeguro` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT ' ',
  `txtOtroSeguro` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT ' ',
  `ingresoPeru` date NULL DEFAULT NULL,
  `rbTrabajo` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT ' ',
  `txtTrabajo` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT ' ',
  `nivelEducativo` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT ' ',
  `otroNivelEducativo` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT ' ',
  `ocupacion` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT ' ',
  `subOcupacion` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT ' ',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4603 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for preocupacionespaciente
-- ----------------------------
DROP TABLE IF EXISTS `preocupacionespaciente`;
CREATE TABLE `preocupacionespaciente`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `valor` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `fecha` date NULL DEFAULT NULL,
  `idPaciente` int NULL DEFAULT NULL,
  `idTerapeuta` int NULL DEFAULT NULL,
  `estado` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'Activo',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for privilegio
-- ----------------------------
DROP TABLE IF EXISTS `privilegio`;
CREATE TABLE `privilegio`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `valor` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `estado` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'Activo',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for provincia
-- ----------------------------
DROP TABLE IF EXISTS `provincia`;
CREATE TABLE `provincia`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `valor` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `idDep` int NULL DEFAULT NULL,
  `estado` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'Activo',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for registropacientes
-- ----------------------------
DROP TABLE IF EXISTS `registropacientes`;
CREATE TABLE `registropacientes`  (
  `idRP` int NOT NULL AUTO_INCREMENT,
  `idPaciente` int NULL DEFAULT NULL,
  `idUsuario` int NULL DEFAULT NULL,
  `idUsuarioAsignado` int NULL DEFAULT NULL,
  `fecha` date NULL DEFAULT NULL,
  `accion` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `observacion` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `fechaAsignadaRP` date NULL DEFAULT NULL,
  `estado` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`idRP`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 135 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for srq18
-- ----------------------------
DROP TABLE IF EXISTS `srq18`;
CREATE TABLE `srq18`  (
  `idsrq` int NOT NULL AUTO_INCREMENT,
  `idPacienteSrq` int NULL DEFAULT NULL,
  `idTerapeutaSrq` int NULL DEFAULT NULL,
  `fechaSrq` date NULL DEFAULT NULL,
  `tipo` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'Estandar',
  `lugar` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `puntajeSi` int NULL DEFAULT NULL,
  `q1` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'No',
  `q2` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'No',
  `q3` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'No',
  `q4` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'No',
  `q5` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'No',
  `q6` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'No',
  `q7` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'No',
  `q8` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'No',
  `q9` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'No',
  `q10` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'No',
  `q11` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'No',
  `q12` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'No',
  `q13` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'No',
  `q14` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'No',
  `q15` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'No',
  `q16` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'No',
  `q17` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'No',
  `q18` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'No',
  `sumatoria` int NULL DEFAULT NULL,
  `estadoSrq` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'Activo',
  `observacionSrq` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`idsrq`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tipodocumento
-- ----------------------------
DROP TABLE IF EXISTS `tipodocumento`;
CREATE TABLE `tipodocumento`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `valor` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `estado` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'Activo',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for usuario
-- ----------------------------
DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `idJefe` int NULL DEFAULT NULL,
  `dni` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `nombre` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `username` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `codigo` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `clave` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `priv` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `fechaCreacion` date NULL DEFAULT NULL,
  `estado` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'Activo',
  `cargo` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `correo` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `srqCheck` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'no',
  `indiceCheck` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'no',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `PM_ID`(`id` ASC, `username` ASC, `codigo` ASC, `nombre` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 55 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Procedure structure for sp.ChangeEstadoxNota
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.ChangeEstadoxNota`;
delimiter ;;
CREATE PROCEDURE `sp.ChangeEstadoxNota`(in idx int, in estadox varchar(45))
BEGIN
update notaEvolucion set estadoNota=estadox where idNota=idx;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.ChangePacientexNota
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.ChangePacientexNota`;
delimiter ;;
CREATE PROCEDURE `sp.ChangePacientexNota`(in idx int, in idPacientex int)
BEGIN
update notaEvolucion set idPacienteNota=idPacientex where idNota=idx;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.DeleteAccionPaciente
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.DeleteAccionPaciente`;
delimiter ;;
CREATE PROCEDURE `sp.DeleteAccionPaciente`(in idx int)
BEGIN
update accionespaciente set estado ='Eliminado' where id=idx;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.DeleteIndiceBienestar
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.DeleteIndiceBienestar`;
delimiter ;;
CREATE PROCEDURE `sp.DeleteIndiceBienestar`(in idx int)
BEGIN
update indicebienestar set estado='Eliminado' where id=idx;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.DeleteObsPaciente
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.DeleteObsPaciente`;
delimiter ;;
CREATE PROCEDURE `sp.DeleteObsPaciente`(in idx int)
BEGIN
update obsPaciente set estado='Eliminado' where id=idx;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.DeleteRegistroPaciente
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.DeleteRegistroPaciente`;
delimiter ;;
CREATE PROCEDURE `sp.DeleteRegistroPaciente`(in idx int)
BEGIN
update registropacientes set estado ='Eliminado' where id=idx;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.DeleteSRQ18
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.DeleteSRQ18`;
delimiter ;;
CREATE PROCEDURE `sp.DeleteSRQ18`(in idx int)
BEGIN
update srq18 set estado='Eliminado' where id=idx;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.DeleteUsuario
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.DeleteUsuario`;
delimiter ;;
CREATE PROCEDURE `sp.DeleteUsuario`(in idx int)
BEGIN
update usuario set estado='Eliminado' where id=idx;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getAccionesPaciente
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getAccionesPaciente`;
delimiter ;;
CREATE PROCEDURE `sp.getAccionesPaciente`()
BEGIN
select * from accionespaciente order by id desc limit 150;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getAccionesPacientexFecha
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getAccionesPacientexFecha`;
delimiter ;;
CREATE PROCEDURE `sp.getAccionesPacientexFecha`(in fecha01 varchar(45), in fecha02 varchar(45))
BEGIN
select * from accionesPaciente where fecha>= fecha01 and fecha<=fecha02;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getAccionesPacientexPaciente
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getAccionesPacientexPaciente`;
delimiter ;;
CREATE PROCEDURE `sp.getAccionesPacientexPaciente`(in idPacientex int)
BEGIN
select * from accionespaciente where idPaciente=idPacientex order by id desc;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getAccionesPacientexTerapeuta
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getAccionesPacientexTerapeuta`;
delimiter ;;
CREATE PROCEDURE `sp.getAccionesPacientexTerapeuta`(in idTerapeutax int)
BEGIN
select * from accionesPaciente where idTerapeuta=idTerapeutax order by id desc;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getCargos
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getCargos`;
delimiter ;;
CREATE PROCEDURE `sp.getCargos`(in valorx varchar(45))
BEGIN
select * from cargo; 
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getCondicionMigratoria
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getCondicionMigratoria`;
delimiter ;;
CREATE PROCEDURE `sp.getCondicionMigratoria`()
BEGIN
select * from condicionmigratoria;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getDepartamentos
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getDepartamentos`;
delimiter ;;
CREATE PROCEDURE `sp.getDepartamentos`()
BEGIN
select * from departamento;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getDerivaciones
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getDerivaciones`;
delimiter ;;
CREATE PROCEDURE `sp.getDerivaciones`(in valorx varchar(45))
BEGIN
select * from derivaciones where lower(valor) like lower(concat('%',valorx,'%'));
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getDocumentos
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getDocumentos`;
delimiter ;;
CREATE PROCEDURE `sp.getDocumentos`(in valorx varchar(45))
BEGIN
select * from tipodocumento where lower(valor) like lower(concat('%',valorx,'%'));
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getGeneros
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getGeneros`;
delimiter ;;
CREATE PROCEDURE `sp.getGeneros`(in valorx varchar(45))
BEGIN
select * from genero; 
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getGrupoVulnerable
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getGrupoVulnerable`;
delimiter ;;
CREATE PROCEDURE `sp.getGrupoVulnerable`(in valorx varchar(45))
BEGIN
select * from grupovulnerable ; 
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getIndiceBienestar
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getIndiceBienestar`;
delimiter ;;
CREATE PROCEDURE `sp.getIndiceBienestar`()
BEGIN
select * from indicebienestar;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getIndicesxFecha
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getIndicesxFecha`;
delimiter ;;
CREATE PROCEDURE `sp.getIndicesxFecha`(in fecha01 varchar(45), in fecha02 varchar(45))
BEGIN
select * from indicebienestar where fecha>= fecha01 and fecha<=fecha02;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getIndicesxPaciente
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getIndicesxPaciente`;
delimiter ;;
CREATE PROCEDURE `sp.getIndicesxPaciente`(in idPacientex int)
BEGIN
select * from indicebienestar where idPaciente=idPacientex;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getIndicesxSumatoria
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getIndicesxSumatoria`;
delimiter ;;
CREATE PROCEDURE `sp.getIndicesxSumatoria`(in sumatoria01 int, in sumatoria02 int)
BEGIN
select * from indicebienestar where sumatoria >= sumatoria01 and sumatoria <= sumatoria02;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getIndicesxUsuario
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getIndicesxUsuario`;
delimiter ;;
CREATE PROCEDURE `sp.getIndicesxUsuario`(in idUsuariox int)
BEGIN
select * from indicebienestar where idUsuario=idUsuario;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getListaEspera
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getListaEspera`;
delimiter ;;
CREATE PROCEDURE `sp.getListaEspera`(IN idPacientex int)
BEGIN
select * from listaespera where idPaciente = idPacientex;

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getListarEspera
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getListarEspera`;
delimiter ;;
CREATE PROCEDURE `sp.getListarEspera`()
BEGIN
select lista.*, paciente.* from listaespera as lista 
left join paciente as paciente on lista.idPaciente = paciente.id;

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getNivelEducativo
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getNivelEducativo`;
delimiter ;;
CREATE PROCEDURE `sp.getNivelEducativo`(in valorx varchar(45))
BEGIN
select * from nivelEducativo; 
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getNotaEvolucion
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getNotaEvolucion`;
delimiter ;;
CREATE PROCEDURE `sp.getNotaEvolucion`()
BEGIN
select * from notaevolucion
cross join paciente on notaevolucion.idPacienteNota = paciente.id
left join usuario on paciente.idTerapeutaAsignado = usuario.id
order by notaevolucion.idPacienteNota desc;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getNotaEvolucionxRangoFecha
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getNotaEvolucionxRangoFecha`;
delimiter ;;
CREATE PROCEDURE `sp.getNotaEvolucionxRangoFecha`(in fecha01 varchar(45),in fecha02 varchar(45))
BEGIN
select * from notaevolucion 
inner join usuario as u on notaevolucion.idTerapeutaNota = u.id
inner join paciente as p on notaevolucion.idPacienteNota = p.id
where fechaNota >= fecha01 and fechaNota<=fecha02 order by fechaNota desc
;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getNotasdePaciente
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getNotasdePaciente`;
delimiter ;;
CREATE PROCEDURE `sp.getNotasdePaciente`(in idPacientex int)
BEGIN
select * from notaevolucion where idPacienteNota=idPacientex order by idNota desc;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getObsPaciente
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getObsPaciente`;
delimiter ;;
CREATE PROCEDURE `sp.getObsPaciente`()
BEGIN
select * from obspaciente order by id desc limit 150;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getObsPacientexFecha
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getObsPacientexFecha`;
delimiter ;;
CREATE PROCEDURE `sp.getObsPacientexFecha`(in fecha01 varchar(45), in fecha02 varchar(45))
BEGIN
select * from obspaciente where fecha>=fecha01 and fecha<=fecha02;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getObsPacientexPaciente
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getObsPacientexPaciente`;
delimiter ;;
CREATE PROCEDURE `sp.getObsPacientexPaciente`(in idPacientex int)
BEGIN
select * from obspaciente where idPaciente=idPacientex;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getObsPacientexTerapeuta
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getObsPacientexTerapeuta`;
delimiter ;;
CREATE PROCEDURE `sp.getObsPacientexTerapeuta`(in idTerapeutax int)
BEGIN
select * from obspaciente where idTerapeuta=idTerapeutax;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getPacientes
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getPacientes`;
delimiter ;;
CREATE PROCEDURE `sp.getPacientes`()
BEGIN
select * from paciente 
left join registropacientes on paciente.id = registropacientes.idPaciente
left join usuario on paciente.idTerapeutaAsignado = usuario.id
order by registropacientes.idPaciente desc;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getPacientesxRangoFecha
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getPacientesxRangoFecha`;
delimiter ;;
CREATE PROCEDURE `sp.getPacientesxRangoFecha`(in fecha01 varchar(45), in fecha02 varchar(45))
BEGIN
select * from paciente
left join usuario on paciente.idTerapeutaAsignado = usuario.id
where paciente.fechaCreacion >= fecha01 and paciente.fechaCreacion <= fecha02 order by paciente.id desc;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getPacientesxRangoySexo
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getPacientesxRangoySexo`;
delimiter ;;
CREATE PROCEDURE `sp.getPacientesxRangoySexo`(in generox varchar(45), in fecha01 varchar(45), in fecha02 varchar(45))
BEGIN
select *  from paciente 
left join usuario on paciente.idTerapeutaAsignado = usuario.id
where lower(paciente.genero) like lower(concat('%',generox,'%'))  and
(paciente.fechaCreacion >= fecha01 and paciente.fechaCreacion<= fecha02)
order by paciente.id desc;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getPacientexFechaCreacion
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getPacientexFechaCreacion`;
delimiter ;;
CREATE PROCEDURE `sp.getPacientexFechaCreacion`(in fechax varchar(45))
BEGIN
select * from paciente 
left join usuario on paciente.idTerapeutaAsignado = usuario.id
where paciente.fechaCreacion=fechax 
order by paciente.id desc;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getPacientexFechaNacimiento
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getPacientexFechaNacimiento`;
delimiter ;;
CREATE PROCEDURE `sp.getPacientexFechaNacimiento`(in fechax varchar(45))
BEGIN
select *  from paciente 
left join usuario on paciente.idTerapeutaAsignado = usuario.id
where paciente.fechaNacimiento = fechax order by paciente.id desc;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getPacientexFechaNacimientoRango
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getPacientexFechaNacimientoRango`;
delimiter ;;
CREATE PROCEDURE `sp.getPacientexFechaNacimientoRango`(in fecha01 varchar(45), in fecha02 varchar(45))
BEGIN
select *  from paciente 
left join usuario on paciente.idTerapeutaAsignado = usuario.id
where paciente.fechaNacimiento >= fecha01 and paciente.fechaNacimiento<=fecha02 order by paciente.id desc;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getPacientexGenero
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getPacientexGenero`;
delimiter ;;
CREATE PROCEDURE `sp.getPacientexGenero`(in generox varchar(45))
BEGIN
select *  from paciente 
left join usuario on paciente.idTerapeutaAsignado = usuario.id
where paciente.genero=generox order by paciente.id desc;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getPacientexGrupoVulnerable
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getPacientexGrupoVulnerable`;
delimiter ;;
CREATE PROCEDURE `sp.getPacientexGrupoVulnerable`(in grupoVulnerablex varchar(45), in fecha01 varchar(45), in fecha02 varchar(45))
BEGIN
select *  from paciente 
left join usuario on paciente.idTerapeutaAsignado = usuario.id
where  lower(paciente.grupoVulnerable) like lower(concat('%',grupoVulnerablex,'%')) and
(paciente.fechaCreacion >= fecha01 and paciente.fechaCreacion<= fecha02) order by paciente.id desc;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getPacientexNombre
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getPacientexNombre`;
delimiter ;;
CREATE PROCEDURE `sp.getPacientexNombre`(in valorx varchar(45))
BEGIN
select *  from paciente 
left join usuario on paciente.idTerapeutaAsignado = usuario.id
where 
lower(paciente.nombres) like lower (concat('%',valorx,'%'))
or
lower(paciente.apellidos) like lower (concat('%',valorx,'%'))
or
lower(paciente.codigo) like lower (concat('%',valorx,'%'))
 order by paciente.id desc;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getPacientexProyecto
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getPacientexProyecto`;
delimiter ;;
CREATE PROCEDURE `sp.getPacientexProyecto`(in proyectox varchar(45), in fecha01 varchar(45), in fecha02 varchar(45))
BEGIN
select *  from paciente 
left join usuario on paciente.idTerapeutaAsignado = usuario.id
where lower(paciente.proyecto) like lower(concat('%',proyectox,'%')) and
(paciente.fechaCreacion >= fecha01 and paciente.fechaCreacion<= fecha02) order by paciente.id desc;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getPacientexRedSoporte
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getPacientexRedSoporte`;
delimiter ;;
CREATE PROCEDURE `sp.getPacientexRedSoporte`(in redSoportex varchar(45))
BEGIN
select *  from paciente 
left join usuario on paciente.idTerapeutaAsignado = usuario.id
where paciente.redSoporte=redSoportex order by paciente.id desc;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getPacientexTerapeuta
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getPacientexTerapeuta`;
delimiter ;;
CREATE PROCEDURE `sp.getPacientexTerapeuta`(in idTerapeutax int, in valorx varchar(45), in fecha01 varchar(45), in fecha02 varchar(45))
BEGIN
select * from paciente 
cross join registropacientes on id=idPaciente 
where idUsuarioAsignado=idTerapeutax and
(lower (nombres) like lower(concat('%',valorx,'%')) 
or
lower (apellidos) like lower(concat('%',valorx,'%'))) and
((fecha>= fecha01 or fecha<=fecha02)
or
(fechaAsignadaRP>= fecha01 or fechaAsignadaRP<=fecha02))
;

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getPacientexTotalSesiones
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getPacientexTotalSesiones`;
delimiter ;;
CREATE PROCEDURE `sp.getPacientexTotalSesiones`(in total01 int, in total02 int)
BEGIN
select *  from paciente 
left join usuario on paciente.idTerapeutaAsignado = usuario.id
where paciente.totalSesiones>= total01 and paciente.totalSesiones<=total02 order by paciente.id desc;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getPrivilegio
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getPrivilegio`;
delimiter ;;
CREATE PROCEDURE `sp.getPrivilegio`(in valorx varchar(45))
BEGIN
select * from privilegio; 
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getRegistrosPaciente
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getRegistrosPaciente`;
delimiter ;;
CREATE PROCEDURE `sp.getRegistrosPaciente`()
BEGIN
select * from registropacientes;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getRegistrosxEstado
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getRegistrosxEstado`;
delimiter ;;
CREATE PROCEDURE `sp.getRegistrosxEstado`(in estadox varchar(45))
BEGIN
select * from registropacientes where
 lower(estado) like lower(concat('%',estadox,'%')) ;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getRegistrosxFecha
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getRegistrosxFecha`;
delimiter ;;
CREATE PROCEDURE `sp.getRegistrosxFecha`(in fecha01 varchar(45), in fecha02 varchar(45))
BEGIN
select * from registropaciente where fecha>=fecha01 and fecha<=fecha02;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getRegistrosxPaciente
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getRegistrosxPaciente`;
delimiter ;;
CREATE PROCEDURE `sp.getRegistrosxPaciente`(in idPacientex int)
BEGIN
select * from registropacientes where idPaciente=idPacientex;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getRegistrosxUsuario
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getRegistrosxUsuario`;
delimiter ;;
CREATE PROCEDURE `sp.getRegistrosxUsuario`(in idUsuariox int)
BEGIN
select * from registropacientes where idUsuario=idUsuariox;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getSRQ18
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getSRQ18`;
delimiter ;;
CREATE PROCEDURE `sp.getSRQ18`()
BEGIN
select * from srq18 
cross join paciente as pac on idPacienteSrq = pac.id
left join usuario on pac.idTerapeutaAsignado = usuario.id
order by srq18.idsrq desc;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getSRQ18conPacienteyTerapeutaxRango
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getSRQ18conPacienteyTerapeutaxRango`;
delimiter ;;
CREATE PROCEDURE `sp.getSRQ18conPacienteyTerapeutaxRango`(in fecha01 varchar(45), in fecha02 varchar(45))
BEGIN
select * from srq18 
inner join paciente as p on srq18.idPacienteSrq = p.id
inner join usuario as u on srq18.idTerapeutaSrq = u.id
where fechaSrq >= fecha01 and fechaSrq <=fecha02 order by idsrq desc;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getSRQ18xEstado
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getSRQ18xEstado`;
delimiter ;;
CREATE PROCEDURE `sp.getSRQ18xEstado`(in valorx varchar(45))
BEGIN
select * from srq18 where
 lower(estado) like lower(concat('%',valorx,'%')) 
 or 
  lower(lugar) like lower(concat('%',valorx,'%'));
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getSRQ18xFecha
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getSRQ18xFecha`;
delimiter ;;
CREATE PROCEDURE `sp.getSRQ18xFecha`(in fecha01 varchar(45), in fecha02 varchar(45))
BEGIN
select * from srq18 where fecha>=fecha01 and fecha<=fecha02;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getSRQ18xPaciente
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getSRQ18xPaciente`;
delimiter ;;
CREATE PROCEDURE `sp.getSRQ18xPaciente`(in idPacientex int)
BEGIN
select * from srq18 where idPacienteSrq=idPacientex;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getSRQ18xTerapeuta
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getSRQ18xTerapeuta`;
delimiter ;;
CREATE PROCEDURE `sp.getSRQ18xTerapeuta`(in idTerapeutax int)
BEGIN
select * from srq18 where idTerapeuta=idTerapeutax;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getUsuario
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getUsuario`;
delimiter ;;
CREATE PROCEDURE `sp.getUsuario`(in usernamex varchar(45))
BEGIN
select * from usuario where username = usernamex COLLATE utf8_unicode_ci;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getUsuarioxCodigo
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getUsuarioxCodigo`;
delimiter ;;
CREATE PROCEDURE `sp.getUsuarioxCodigo`(in valorx varchar(45))
BEGIN
select * from usuario ;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getUsuarioxID
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getUsuarioxID`;
delimiter ;;
CREATE PROCEDURE `sp.getUsuarioxID`(in idx int)
BEGIN
select * from usuario where id=idx;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.getUsuarioxJefe
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.getUsuarioxJefe`;
delimiter ;;
CREATE PROCEDURE `sp.getUsuarioxJefe`(in idJefex int, in valorx varchar(45))
BEGIN
select * from usuario where idJefe=idJefex and 
(lower (codigo) like lower (concat('%',valorx,'%'))
or
lower (nombre) like lower (concat('%',valorx,'%'))
);
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.InsertListaEspera
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.InsertListaEspera`;
delimiter ;;
CREATE PROCEDURE `sp.InsertListaEspera`(IN idPacientex int,IN idTrabajadorSocialx int)
BEGIN
	insert into listaespera 
	(idPaciente,idTrabajadorSocial,fechaModificacion,usuarioModificacion)
	VALUES
	(idPacientex,idTrabajadorSocialx,now(),idTrabajadorSocialx);

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.LiberarListaEspera
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.LiberarListaEspera`;
delimiter ;;
CREATE PROCEDURE `sp.LiberarListaEspera`(IN idPacientex int,IN idTrabajadorSocialx int)
BEGIN
update listaespera set 
	fechaModificacion=now(),
	estado = 'Atendido',
	usuarioModificacion = idTrabajadorSocialx
where idPaciente = idPacientex;


END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.newAccionPaciente
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.newAccionPaciente`;
delimiter ;;
CREATE PROCEDURE `sp.newAccionPaciente`(in valorx varchar(450),in idPacientex int, in idTerapeuta int)
BEGIN
insert into accionespaciente  
(valor, idPaciente, idTerapeuta,fecha)
values
(valorx, idPacientex, idTerapeutax,curdate());
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.newCargo
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.newCargo`;
delimiter ;;
CREATE PROCEDURE `sp.newCargo`(in valorx varchar(45))
BEGIN
insert into cargo (valor) values (valorx);

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.newCondicionMigratoria
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.newCondicionMigratoria`;
delimiter ;;
CREATE PROCEDURE `sp.newCondicionMigratoria`(in valorx varchar(45))
BEGIN
insert into condicionmigratoria (valor) values (valorx);
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.newDepartamento
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.newDepartamento`;
delimiter ;;
CREATE PROCEDURE `sp.newDepartamento`(in nombrex varchar(45), in padrex int, in tipox varchar(45))
BEGIN
insert into departamento (nombre,padre,tipo) values (nombrex,padrex,tipox);
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.newDerivacion
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.newDerivacion`;
delimiter ;;
CREATE PROCEDURE `sp.newDerivacion`(in valorx varchar(45))
BEGIN
insert into derivaciones (valor) values (valorx);
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.newDocumento
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.newDocumento`;
delimiter ;;
CREATE PROCEDURE `sp.newDocumento`(in valorx varchar(45))
BEGIN
insert into tipodocumento (valor) values (valorx);
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.newGenero
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.newGenero`;
delimiter ;;
CREATE PROCEDURE `sp.newGenero`(in valorx varchar(45))
BEGIN
insert into genero (valor) values (valorx);

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.newGrupoVulnerable
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.newGrupoVulnerable`;
delimiter ;;
CREATE PROCEDURE `sp.newGrupoVulnerable`(in valorx varchar(45))
BEGIN
insert into grupovulnerable (valor) values (valorx);

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.newIndiceBienestar
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.newIndiceBienestar`;
delimiter ;;
CREATE PROCEDURE `sp.newIndiceBienestar`(in idPacientex int, in idUsuariox int, in observacionx varchar(100), in estadox varchar(45),
in q1x int, in q2x int, in q3x int , in q4x int, in q5x int)
BEGIN
set @sumx = ((q1x+q2x+q3x+q4x+q5x)*4);
insert into indicebienestar 
(idPaciente,idUsuario,fecha,observacion,sumatoria,estado,q1,q2,q3,q4,q5)
values
(idPacientex,idUsuariox,curdate(),observacionx,@sumx,estadox,q1x,q2x,q3x,q4x,q5x);
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.newNivelEducativo
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.newNivelEducativo`;
delimiter ;;
CREATE PROCEDURE `sp.newNivelEducativo`(in valorx varchar(100))
BEGIN
insert into nivelEducativo (valor) values (valorx);

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.newNotaEvolucion
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.newNotaEvolucion`;
delimiter ;;
CREATE PROCEDURE `sp.newNotaEvolucion`(in idPacientex int,in idTerapeutax int, in observacionNotax varchar(1000),
in sintomax varchar(250), in relacionesx varchar(250),in limitesx varchar(250),in ansiedadx  varchar(250),
in manejoAgresionx varchar(250),in funcionalidadx  varchar(250),in trabajoTerapeuticox varchar(250))
BEGIN
insert into notaevolucion
(idPacienteNota,idTerapeutaNota,fechaNota,observacionNota,sintomas,relaciones,limites,ansiedad,manejoAgresion,
funcionalidad,trabajoTerapeutico,estadoNota)
values
(idPacientex,idTerapeutax,curdate(),observacionNotax,sintomax,relacionesx,limitesx,ansiedadx,manejoAgresionx,
funcionalidadx,trabajoTerapeuticox,'Activo');

update paciente set totalSesiones=(totalSesiones+1) where id=idPacientex;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.newObsPaciente
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.newObsPaciente`;
delimiter ;;
CREATE PROCEDURE `sp.newObsPaciente`(in valorx varchar(1000),in idPacientex int,in idTerapeutax int)
BEGIN
insert into obsPaciente 
(valor,idPaciente,idTerapeuta,fecha)
values
(valorx,idPacientex,idTerapeutax,curdate());
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.newPaciente
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.newPaciente`;
delimiter ;;
CREATE PROCEDURE `sp.newPaciente`(in nombrex varchar(45), in apellidosx varchar(45),in tipoDocumentox varchar(45),
 in dnix varchar(45), in generox varchar(45),
in fechaNacimientox varchar(45), in totalSesionesx int, in telefonox varchar(45), in telefonoOpcionalx varchar(45),
in correox varchar(45), in nacionalidadx varchar(45), in condicionMigratoriax varchar(45),
in departamentox varchar(45), in provinciax varchar(45),in distritox varchar(45),
in grupoVulnerablex varchar(45), in discapacidadx varchar(45), in redSoportex varchar(45),
in nombreRedSoportex varchar(45),in srqIngresox varchar(45),in observacionx varchar(500), 
in proyectox varchar(45), in motivoConsultax varchar(5000), in accionesx varchar(100),
in codigox varchar(45), in modalidadx varchar(45), in detalleDerivadox varchar(45), in detalleOtroTelefonox varchar(100), in contactoRedSoportex varchar(45),
in cantidadGrupoFamiliarx varchar(45),
in rbSegurox  varchar(45),
in txtOtroSegurox varchar(100),
in ingresoPerux varchar(45),
in rbTrabajox varchar(45),
in txtTrabajox varchar(100),
in nivelEducativox varchar(100),
in otroNivelEducativox varchar(100),
in ocupacionx varchar(100),
in subOcupacionx varchar(100),
in idTerapeutaAsignadox int)
BEGIN
insert into paciente  
(nombres,apellidos,tipoDocumento,dni,genero,fechaCreacion,fechaNacimiento,totalSesiones,telefono,telefonoOpcional,correo,
nacionalidad,condicionMigratoria,departamento,provincia,distrito,grupoVulnerable,discapacidad,
redSoporte,nombreRedSoporte,srqIngreso,observacion,proyecto,motivoConsulta,acciones,codigo,modalidad,detalleDerivado,detalleOtroTelefono,contactoRedSoporte,
cantidadGrupoFamiliar,
rbSeguro,
txtOtroSeguro,
ingresoPeru,
rbTrabajo,
txtTrabajo,
nivelEducativo,
otroNivelEducativo,
ocupacion,
subOcupacion,idTerapeutaAsignado)
values
(nombrex,apellidosx,tipoDocumentox,dnix,generox,curdate(),fechaNacimientox,totalSesionesx,telefonox,telefonoOpcionalx,correox,
nacionalidadx,condicionMigratoriax,departamentox,provinciax,distritox,grupoVulnerablex,discapacidadx,
redSoportex,nombreRedSoportex,srqIngresox,observacionx,proyectox,motivoConsultax,accionesx,codigox,modalidadx,detalleDerivadox,detalleOtroTelefonox,contactoRedSoportex,
cantidadGrupoFamiliarx,
rbSegurox,
txtOtroSegurox,
ingresoPerux,
rbTrabajox,
txtTrabajox,
nivelEducativox,
otroNivelEducativox,
ocupacionx,
subOcupacionx,idTerapeutaAsignadox);

set @idInsertado = last_insert_id();
select @idInsertado;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.newPrivilegio
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.newPrivilegio`;
delimiter ;;
CREATE PROCEDURE `sp.newPrivilegio`(in valorx varchar(45))
BEGIN
insert into privilegio (valor) values (valorx);

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.newRegistroPaciente
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.newRegistroPaciente`;
delimiter ;;
CREATE PROCEDURE `sp.newRegistroPaciente`(in idPacientex int, idUsuariox int, in idUsuarioAsignadox int,
in accionx varchar(45), in observacionx varchar(200), in fechaAsignadax varchar(45), in estadox varchar(45))
BEGIN
insert into registropacientes
(idPaciente,idUsuario,idUsuarioAsignado,fecha,accion,observacion,fechaAsignadaRP,estado)
values
(idPacientex,idUsuariox,idUsuarioAsignadox,curdate(),accionx,observacionx,fechaAsignadax,estadox);
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.newSRQ18
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.newSRQ18`;
delimiter ;;
CREATE PROCEDURE `sp.newSRQ18`(in idPacientex int, in idTerapeutax int, in lugarx varchar(60), in puntajeSix int, in tipox varchar(45),
in q1x varchar(10),in q2x varchar(10),in q3x varchar(10),
in q4x varchar(10),in q5x varchar(10),in q6x varchar(10),
in q7x varchar(10),in q8x varchar(10),in q9x varchar(10),
in q10x varchar(10),in q11x varchar(10),in q12x varchar(10),
in q13x varchar(10),in q14x varchar(10),in q15x varchar(10),
in q16x varchar(10),in q17x varchar(10),in q18x varchar(10), in sumatoriax int, in observacionx varchar(250))
BEGIN
insert into srq18
(idPacienteSrq,idTerapeutaSrq,lugar,puntajeSi,fechaSrq,tipo,
q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14,q15,q16,q17,q18,sumatoria,observacionSrq)
values
(idPacientex,idTerapeutax,lugarx,puntajeSix,curdate(),tipox,
q1x,q2x,q3x,q4x,q5x,q6x,q7x,q8x,q9x,q10x,q11x,q12x,q13x,q14x,q15x,q16x,q17x,q18x,sumatoriax,observacionx);

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.newUsuario
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.newUsuario`;
delimiter ;;
CREATE PROCEDURE `sp.newUsuario`(in idJefex int,
in dnix varchar(20),
 in nombrex varchar(80),
 in usernamex varchar(45),
in codigox varchar(45), 
in clavex varchar(45),
 in privx varchar(45),
 in cargox varchar(45),
 in correox varchar(45),
  in srqx varchar(45),
   in indicex varchar(45))
BEGIN
insert into usuario 
(idJefe,
dni,
nombre,
username,
codigo,
clave,
priv,
fechaCreacion,
cargo,
correo,
srqCheck,
indiceCheck)
values
(idJefex,
dnix,
nombrex,
usernamex,
codigox,
clavex,
privx,
curdate(),
cargox,
correox,
srqx,
indicex);

set @newUsuarioIDx = last_insert_id();
select @newUsuarioIDx;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.UpdateAccionPaciente
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.UpdateAccionPaciente`;
delimiter ;;
CREATE PROCEDURE `sp.UpdateAccionPaciente`(in idx int, in idPacientex int, in valorx varchar(450), in estadox varchar(45))
BEGIN
update accionespaciente set valor=valorx, idPaciente=idPacientex, estado=estadox where id=idx;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.UpdateCargos
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.UpdateCargos`;
delimiter ;;
CREATE PROCEDURE `sp.UpdateCargos`(in idx int, in valorx varchar(45), in estadox varchar(45))
BEGIN
update cargo set valor=valorx, estado=estadox where id=idx;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.UpdateCondicionMigratoria
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.UpdateCondicionMigratoria`;
delimiter ;;
CREATE PROCEDURE `sp.UpdateCondicionMigratoria`(in idx int, in valorx varchar(45), in estadox varchar(45))
BEGIN
update condicionmigratoria set valor=valorx,estado=estadox where id=idx;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.UpdateDerivacion
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.UpdateDerivacion`;
delimiter ;;
CREATE PROCEDURE `sp.UpdateDerivacion`(in idx int, in valorx varchar(45), in estadox varchar(45))
BEGIN
update derivaciones set valor=valorx,estado=estadox where id=idx;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.UpdateDocumento
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.UpdateDocumento`;
delimiter ;;
CREATE PROCEDURE `sp.UpdateDocumento`(in idx int, in valorx varchar(45), in estadox varchar(45))
BEGIN
update tipodocumento set valor=valorx,estado=estadox where id=idx;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.UpdateGenero
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.UpdateGenero`;
delimiter ;;
CREATE PROCEDURE `sp.UpdateGenero`(in idx int, in valorx varchar(45), in estadox varchar(45))
BEGIN
update genero set valor=valorx, estado=estadox where id=idx;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.UpdateGruposVulnerables
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.UpdateGruposVulnerables`;
delimiter ;;
CREATE PROCEDURE `sp.UpdateGruposVulnerables`(in idx int, in valorx varchar(45), in estadox varchar(45))
BEGIN
update grupovulnerable set valor=valorx, estado=estadox where id=idx;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.UpdateNivelEducativo
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.UpdateNivelEducativo`;
delimiter ;;
CREATE PROCEDURE `sp.UpdateNivelEducativo`(in idx int, in valorx varchar(100), in estadox varchar(45))
BEGIN
update nivelEducativo set valor=valorx, estado=estadox where id=idx;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.UpdateNotaEvolucion
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.UpdateNotaEvolucion`;
delimiter ;;
CREATE PROCEDURE `sp.UpdateNotaEvolucion`(in idx int, in observacionx varchar(1000), in sintomasx varchar(250), in relacionex varchar(250),
in limitesx varchar(250),in ansiedadx varchar(250),in manejoAgresionx varchar(250),
in funcionalidadx varchar(250),in trabajoTerapeuticox varchar(250))
BEGIN
update notaEvolucion set observacion=observacionx, sintomas=sintomasx,
relacione=relacionex,limites=limitesx,ansiedad=ansiedadx,manejoAgresion=manejoAgresionx,
funcionalidad=funcionalidadx,trabajoTerapeutico=trabajoTerapeuticox where idNota=idx;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.UpdateObsPaciente
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.UpdateObsPaciente`;
delimiter ;;
CREATE PROCEDURE `sp.UpdateObsPaciente`(in idx int,in idpacientex int,in valorx varchar(1000), in estadox varchar(45))
BEGIN
update obsPaciente set idPaciente=idpacientex,valor=valorx,estado=estadox where id=idx;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.UpdatePaciente
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.UpdatePaciente`;
delimiter ;;
CREATE PROCEDURE `sp.UpdatePaciente`(in idx int,
 in nombresx varchar(45),
 in apellidosx varchar(45),
 in tipoDocumentox varchar(45),
 in dnix varchar(45), 
in generox varchar(45),
in fechaNacimientox varchar(45),
 in totalSesionesx int,
 in telefonox varchar(45),
 in telefonoOpcionalx varchar(45),
in correox varchar(45),
 in nacionalidadx varchar(45),
 in condicionMigratoriax varchar(45),
in departamentox varchar(45),
 in provinciax varchar(45),
 in distritox varchar(45),
in grupoVulnerablex varchar(45),
 in discapacidadx varchar(45),
 in redSoportex varchar(45),
in nombreRedSoportex varchar(45),
 srqIngresox varchar(45),
 observacionx varchar(500), 
in proyectox varchar(45),
 in motivoConsultax varchar(5000),
 in accionesx varchar(100),
 in codigox varchar(45),
 in modalidadx varchar(45),
 in detalleDerivadox varchar(45),
 in detalleOtroTelefonox varchar(100),
 in contactoRedSoportex varchar(45),
 in cantidadGrupoFamiliarx varchar(45),
in rbSegurox  varchar(45),
in txtOtroSegurox varchar(100),
in ingresoPerux varchar(45),
in rbTrabajox varchar(45),
in txtTrabajox varchar(100),
in nivelEducativox varchar(100),
in otroNivelEducativox varchar(100),
in ocupacionx varchar(100),
in subOcupacionx varchar(100),
in idTerapeutax int)
BEGIN
update paciente set 
codigo=codigox,
nombres = nombresx,
apellidos=apellidosx,
tipoDocumento=tipoDocumentox,
dni=dnix,
genero=generox,
fechaNacimiento=fechaNacimientox,
 telefono=telefonox,
 telefonoOpcional=telefonoOpcionalx,
 correo=correox,
 nacionalidad=nacionalidadx,
condicionMigratoria=condicionMigratoriax,
departamento=departamentox,
provincia=provinciax,
distrito=distritox,
grupoVulnerable=grupoVulnerablex,
discapacidad=discapacidadx,
redSoporte=redSoportex,
nombreRedSoporte=nombreRedSoportex,
srqIngreso=srqIngresox,
observacion=observacionx,
proyecto=proyectox,
motivoCOnsulta=motivoConsultax,
acciones=accionesx,
detalleOtroTelefono=detalleOtroTelefonox,
contactoRedSoporte=contactoRedSoportex,
modalidad=modalidadx,
detalleDerivado=detalleDerivadox,
cantidadGrupoFamiliar=cantidadGrupoFamiliarx,
rbSeguro=rbSegurox,
txtOtroSeguro=txtOtroSegurox,
ingresoPeru=ingresoPerux,
rbTrabajo=rbTrabajox,
txtTrabajo=txtTrabajox,
nivelEducativo=nivelEducativox,
otroNivelEducativo=otroNivelEducativox,
ocupacion=ocupacionx,
subOcupacion=subOcupacionx,
idTerapeutaAsignado=idTerapeutax
where id=idx;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.UpdatePrivilegio
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.UpdatePrivilegio`;
delimiter ;;
CREATE PROCEDURE `sp.UpdatePrivilegio`(in idx int, in valorx varchar(45), in estadox varchar(45))
BEGIN
update privilegio set valor=valorx, estado=estadox where id=idx;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.UpdateRegistroPacientes
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.UpdateRegistroPacientes`;
delimiter ;;
CREATE PROCEDURE `sp.UpdateRegistroPacientes`(in idx int,idUsuarioAsignadox int,
in accionx varchar(45),in observacionx varchar(200), in fechaAsignadax varchar(45), in estadox varchar(45))
BEGIN
update registroPacientes set
idUsuarioAsignado=idUsuarioAsignadox, accion=accionx,observacion=observacionx,fechaAsignadaRP=fechaAsignadax, estado=estadox
where idRP=idx;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.UpdateSRQ18
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.UpdateSRQ18`;
delimiter ;;
CREATE PROCEDURE `sp.UpdateSRQ18`(in idx int, in idPacientex int,in lugarx varchar(60), in puntajeSix int, in tipox varchar(45),
in estadox varchar(45),
in q1x varchar(10),in q2x varchar(10),in q3x varchar(10),
in q4x varchar(10),in q5x varchar(10),in q6x varchar(10),
in q7x varchar(10),in q8x varchar(10),in q9x varchar(10),
in q10x varchar(10),in q11x varchar(10),in q12x varchar(10),
in q13x varchar(10),in q14x varchar(10),in q15x varchar(10),
in q16x varchar(10),in q17x varchar(10),in q18x varchar(10))
BEGIN
update srq18 set idPacienteSrq=idPacientex, lugar=lugarx, puntajeSi=puntajeSix,tipo=tipox,
q1=q1x,q2=q2x,q3=q3x,q4=q4x,q5=q5x,q6=q6x,
q7=q7x,q8=q8x,q9=q9x,q10=q10x,q11=q11x,q12=q12x,
q13=q13x,q14=q14x,q15=q15x,q16=q16x,q17=q17x,q18=q18x,estadoSrq=estadox where idsrq=idx;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.UpdateTerapeutaPaciente
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.UpdateTerapeutaPaciente`;
delimiter ;;
CREATE PROCEDURE `sp.UpdateTerapeutaPaciente`(IN idTerapeutax int,IN idPacientex int)
BEGIN
	update paciente set 
	idTerapeutaAsignado = idTerapeutax
	where id = idPacientex;

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for sp.UpdateUsuario
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp.UpdateUsuario`;
delimiter ;;
CREATE PROCEDURE `sp.UpdateUsuario`(in idx int,in idJefex int, in dnix varchar(20), in nombrex varchar(80), in usernamex varchar(45),
in codigox varchar(45), in clavex varchar(45), in privx varchar(45), in cargox varchar(45), in estadox varchar(45),in correox varchar(45),in srqx varchar(45),in indicex varchar(45))
BEGIN
update usuario set 
idJefe=idJefex,dni=dnix, nombre=nombrex, 
username=usernamex,codigo=codigox,
clave=clavex,priv=privx,cargo=cargox,
estado=estadox, correo=correox, srqCheck=srqx, indiceCheck=indicex
 where id=idx;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for test
-- ----------------------------
DROP PROCEDURE IF EXISTS `test`;
delimiter ;;
CREATE PROCEDURE `test`()
BEGIN
set @numer = 1;
select @number;
END
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
