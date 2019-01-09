/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_6211_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String erplace_cd;
	public String vat_fr_yymm;
	public String vat_to_yymm;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public FC_ACCT_6211_SDM(){}
	public FC_ACCT_6211_SDM(String cmpy_cd, String erplace_cd, String vat_fr_yymm, String vat_to_yymm, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.erplace_cd = erplace_cd;
		this.vat_fr_yymm = vat_fr_yymm;
		this.vat_to_yymm = vat_to_yymm;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setVat_fr_yymm(String vat_fr_yymm){
		this.vat_fr_yymm = vat_fr_yymm;
	}

	public void setVat_to_yymm(String vat_to_yymm){
		this.vat_to_yymm = vat_to_yymm;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getVat_fr_yymm(){
		return this.vat_fr_yymm;
	}

	public String getVat_to_yymm(){
		return this.vat_to_yymm;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6211_S(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6211_SDM dm = (FC_ACCT_6211_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.erplace_cd);
		cstmt.setString(5, dm.vat_fr_yymm);
		cstmt.setString(6, dm.vat_to_yymm);
		cstmt.setString(7, dm.incmg_pers);
		cstmt.setString(8, dm.incmg_pers_ipadd);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.INTEGER);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, Types.VARCHAR);
		cstmt.registerOutParameter(21, Types.VARCHAR);
		cstmt.registerOutParameter(22, Types.VARCHAR);
		cstmt.registerOutParameter(23, Types.VARCHAR);
		cstmt.registerOutParameter(24, Types.VARCHAR);
		cstmt.registerOutParameter(25, Types.VARCHAR);
		cstmt.registerOutParameter(26, Types.VARCHAR);
		cstmt.registerOutParameter(27, Types.VARCHAR);
		cstmt.registerOutParameter(28, Types.VARCHAR);
		cstmt.registerOutParameter(29, Types.VARCHAR);
		cstmt.registerOutParameter(30, Types.VARCHAR);
		cstmt.registerOutParameter(31, Types.VARCHAR);
		cstmt.registerOutParameter(32, Types.VARCHAR);
		cstmt.registerOutParameter(33, Types.VARCHAR);
		cstmt.registerOutParameter(34, Types.VARCHAR);
		cstmt.registerOutParameter(35, Types.VARCHAR);
		cstmt.registerOutParameter(36, Types.VARCHAR);
		cstmt.registerOutParameter(37, Types.VARCHAR);
		cstmt.registerOutParameter(38, Types.VARCHAR);
		cstmt.registerOutParameter(39, Types.VARCHAR);
		cstmt.registerOutParameter(40, Types.VARCHAR);
		cstmt.registerOutParameter(41, Types.VARCHAR);
		cstmt.registerOutParameter(42, Types.VARCHAR);
		cstmt.registerOutParameter(43, Types.VARCHAR);
		cstmt.registerOutParameter(44, Types.VARCHAR);
		cstmt.registerOutParameter(45, Types.VARCHAR);
		cstmt.registerOutParameter(46, Types.VARCHAR);
		cstmt.registerOutParameter(47, Types.VARCHAR);
		cstmt.registerOutParameter(48, Types.VARCHAR);
		cstmt.registerOutParameter(49, Types.VARCHAR);
		cstmt.registerOutParameter(50, Types.VARCHAR);
		cstmt.registerOutParameter(51, Types.VARCHAR);
		cstmt.registerOutParameter(52, Types.VARCHAR);
		cstmt.registerOutParameter(53, Types.VARCHAR);
		cstmt.registerOutParameter(54, Types.VARCHAR);
		cstmt.registerOutParameter(55, Types.VARCHAR);
		cstmt.registerOutParameter(56, Types.VARCHAR);
		cstmt.registerOutParameter(57, Types.VARCHAR);
		cstmt.registerOutParameter(58, Types.VARCHAR);
		cstmt.registerOutParameter(59, Types.VARCHAR);
		cstmt.registerOutParameter(60, Types.VARCHAR);
		cstmt.registerOutParameter(61, Types.VARCHAR);
		cstmt.registerOutParameter(62, Types.VARCHAR);
		cstmt.registerOutParameter(63, Types.VARCHAR);
		cstmt.registerOutParameter(64, Types.VARCHAR);
		cstmt.registerOutParameter(65, Types.VARCHAR);
		cstmt.registerOutParameter(66, Types.VARCHAR);
		cstmt.registerOutParameter(67, Types.VARCHAR);
		cstmt.registerOutParameter(68, Types.VARCHAR);
		cstmt.registerOutParameter(69, Types.VARCHAR);
		cstmt.registerOutParameter(70, Types.VARCHAR);
		cstmt.registerOutParameter(71, Types.VARCHAR);
		cstmt.registerOutParameter(72, Types.VARCHAR);
		cstmt.registerOutParameter(73, Types.VARCHAR);
		cstmt.registerOutParameter(74, Types.VARCHAR);
		cstmt.registerOutParameter(75, Types.VARCHAR);
		cstmt.registerOutParameter(76, Types.VARCHAR);
		cstmt.registerOutParameter(77, Types.VARCHAR);
		cstmt.registerOutParameter(78, Types.VARCHAR);
		cstmt.registerOutParameter(79, Types.VARCHAR);
		cstmt.registerOutParameter(80, Types.VARCHAR);
		cstmt.registerOutParameter(81, Types.VARCHAR);
		cstmt.registerOutParameter(82, Types.VARCHAR);
		cstmt.registerOutParameter(83, Types.VARCHAR);
		cstmt.registerOutParameter(84, Types.VARCHAR);
		cstmt.registerOutParameter(85, Types.VARCHAR);
		cstmt.registerOutParameter(86, Types.VARCHAR);
		cstmt.registerOutParameter(87, Types.VARCHAR);
		cstmt.registerOutParameter(88, Types.VARCHAR);
		cstmt.registerOutParameter(89, Types.VARCHAR);
		cstmt.registerOutParameter(90, Types.VARCHAR);
		cstmt.registerOutParameter(91, Types.VARCHAR);
		cstmt.registerOutParameter(92, Types.VARCHAR);
		cstmt.registerOutParameter(93, Types.VARCHAR);
		cstmt.registerOutParameter(94, Types.VARCHAR);
		cstmt.registerOutParameter(95, Types.VARCHAR);
		cstmt.registerOutParameter(96, Types.VARCHAR);
		cstmt.registerOutParameter(97, Types.VARCHAR);
		cstmt.registerOutParameter(98, Types.VARCHAR);
		cstmt.registerOutParameter(99, Types.VARCHAR);
		cstmt.registerOutParameter(100, Types.VARCHAR);
		cstmt.registerOutParameter(101, Types.VARCHAR);
		cstmt.registerOutParameter(102, Types.VARCHAR);
		cstmt.registerOutParameter(103, Types.VARCHAR);
		cstmt.registerOutParameter(104, Types.VARCHAR);
		cstmt.registerOutParameter(105, Types.VARCHAR);
		cstmt.registerOutParameter(106, Types.VARCHAR);
		cstmt.registerOutParameter(107, Types.VARCHAR);
		cstmt.registerOutParameter(108, Types.VARCHAR);
		cstmt.registerOutParameter(109, Types.VARCHAR);
		cstmt.registerOutParameter(110, Types.VARCHAR);
		cstmt.registerOutParameter(111, Types.VARCHAR);
		cstmt.registerOutParameter(112, Types.VARCHAR);
		cstmt.registerOutParameter(113, Types.VARCHAR);
		cstmt.registerOutParameter(114, Types.VARCHAR);
		cstmt.registerOutParameter(115, Types.VARCHAR);
		cstmt.registerOutParameter(116, Types.VARCHAR);
		cstmt.registerOutParameter(117, Types.VARCHAR);
		cstmt.registerOutParameter(118, Types.VARCHAR);
		cstmt.registerOutParameter(119, Types.VARCHAR);
		cstmt.registerOutParameter(120, Types.VARCHAR);
		cstmt.registerOutParameter(121, Types.VARCHAR);
		cstmt.registerOutParameter(122, Types.VARCHAR);
		cstmt.registerOutParameter(123, Types.VARCHAR);
		cstmt.registerOutParameter(124, Types.VARCHAR);
		cstmt.registerOutParameter(125, Types.VARCHAR);
		cstmt.registerOutParameter(126, Types.VARCHAR);
		cstmt.registerOutParameter(127, Types.VARCHAR);
		cstmt.registerOutParameter(128, Types.VARCHAR);
		cstmt.registerOutParameter(129, Types.VARCHAR);
		cstmt.registerOutParameter(130, Types.VARCHAR);
		cstmt.registerOutParameter(131, Types.VARCHAR);
		cstmt.registerOutParameter(132, Types.VARCHAR);
		cstmt.registerOutParameter(133, Types.VARCHAR);
		cstmt.registerOutParameter(134, Types.VARCHAR);
		cstmt.registerOutParameter(135, Types.VARCHAR);
		cstmt.registerOutParameter(136, Types.VARCHAR);
		cstmt.registerOutParameter(137, Types.VARCHAR);
		cstmt.registerOutParameter(138, Types.VARCHAR);
		cstmt.registerOutParameter(139, Types.VARCHAR);
		cstmt.registerOutParameter(140, Types.VARCHAR);
		cstmt.registerOutParameter(141, Types.VARCHAR);
		cstmt.registerOutParameter(142, Types.VARCHAR);
		cstmt.registerOutParameter(143, Types.VARCHAR);
		cstmt.registerOutParameter(144, Types.VARCHAR);
		cstmt.registerOutParameter(145, Types.VARCHAR);
		cstmt.registerOutParameter(146, Types.VARCHAR);
		cstmt.registerOutParameter(147, Types.VARCHAR);
		cstmt.registerOutParameter(148, Types.VARCHAR);
		cstmt.registerOutParameter(149, Types.VARCHAR);
		cstmt.registerOutParameter(150, Types.VARCHAR);
		cstmt.registerOutParameter(151, Types.VARCHAR);
		cstmt.registerOutParameter(152, Types.VARCHAR);
		cstmt.registerOutParameter(153, Types.VARCHAR);
		cstmt.registerOutParameter(154, Types.VARCHAR);
		cstmt.registerOutParameter(155, Types.VARCHAR);
		cstmt.registerOutParameter(156, Types.VARCHAR);
		cstmt.registerOutParameter(157, Types.VARCHAR);
		cstmt.registerOutParameter(158, Types.VARCHAR);
		cstmt.registerOutParameter(159, Types.VARCHAR);
		cstmt.registerOutParameter(160, Types.VARCHAR);
		cstmt.registerOutParameter(161, Types.VARCHAR);
		cstmt.registerOutParameter(162, Types.VARCHAR);
		cstmt.registerOutParameter(163, Types.VARCHAR);
		cstmt.registerOutParameter(164, Types.VARCHAR);
		cstmt.registerOutParameter(165, Types.VARCHAR);
		cstmt.registerOutParameter(166, Types.VARCHAR);
		cstmt.registerOutParameter(167, Types.VARCHAR);
		cstmt.registerOutParameter(168, Types.VARCHAR);
		cstmt.registerOutParameter(169, Types.VARCHAR);
		cstmt.registerOutParameter(170, Types.VARCHAR);
		cstmt.registerOutParameter(171, Types.VARCHAR);
		cstmt.registerOutParameter(172, Types.VARCHAR);
		cstmt.registerOutParameter(173, Types.VARCHAR);
		cstmt.registerOutParameter(174, Types.VARCHAR);
		cstmt.registerOutParameter(175, Types.VARCHAR);
		cstmt.registerOutParameter(176, Types.VARCHAR);
		cstmt.registerOutParameter(177, Types.VARCHAR);
		cstmt.registerOutParameter(178, Types.VARCHAR);
		cstmt.registerOutParameter(179, Types.VARCHAR);
		cstmt.registerOutParameter(180, Types.VARCHAR);
		cstmt.registerOutParameter(181, Types.VARCHAR);
		cstmt.registerOutParameter(182, Types.VARCHAR);
		cstmt.registerOutParameter(183, Types.VARCHAR);
		cstmt.registerOutParameter(184, OracleTypes.CURSOR);
		cstmt.registerOutParameter(185, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6211_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
		System.out.println("vat_fr_yymm = [" + getVat_fr_yymm() + "]");
		System.out.println("vat_to_yymm = [" + getVat_to_yymm() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
}
String vat_fr_yymm = req.getParameter("vat_fr_yymm");
if( vat_fr_yymm == null){
	System.out.println(this.toString+" : vat_fr_yymm is null" );
}else{
	System.out.println(this.toString+" : vat_fr_yymm is "+vat_fr_yymm );
}
String vat_to_yymm = req.getParameter("vat_to_yymm");
if( vat_to_yymm == null){
	System.out.println(this.toString+" : vat_to_yymm is null" );
}else{
	System.out.println(this.toString+" : vat_to_yymm is "+vat_to_yymm );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
String vat_fr_yymm = Util.checkString(req.getParameter("vat_fr_yymm"));
String vat_to_yymm = Util.checkString(req.getParameter("vat_to_yymm"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
String vat_fr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_fr_yymm")));
String vat_to_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_to_yymm")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setErplace_cd(erplace_cd);
dm.setVat_fr_yymm(vat_fr_yymm);
dm.setVat_to_yymm(vat_to_yymm);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 21 11:14:03 KST 2015 */