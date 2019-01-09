/***************************************************************************************************
* 파일명 : SE_SAL_1740_ADM.java
* 기능 : 판매 - 지대관리 - 매출관리 - 계산서 발행
* 작성일자 : 2009-04-21
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.ds.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_1740_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd		;
	public String yymm			;
	public String gubun			;
	public String vat_gubun		;
	public String correct_gubun ;
	public String tmsg_type		;
	public String stmt_clsf		;
	public String pers_clsf		;
	public String semuro_id		;
	public String incmg_pers_ip	;
	public String incmg_pers	;

	public SE_SAL_1740_ADM(){}
	public SE_SAL_1740_ADM(String cmpy_cd, String yymm, String gubun, String vat_gubun, String correct_gubun, String tmsg_type, String stmt_clsf, String pers_clsf, String semuro_id, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd 		= cmpy_cd		;
		this.yymm 			= yymm			;
		this.gubun 			= gubun			;
		this.vat_gubun 		= vat_gubun		;
		this.correct_gubun	= correct_gubun	;
		this.tmsg_type 		= tmsg_type		;
		this.stmt_clsf 		= stmt_clsf		;
		this.pers_clsf 		= pers_clsf		;
		this.semuro_id		= semuro_id		;
		this.incmg_pers_ip 	= incmg_pers_ip	;
		this.incmg_pers 	= incmg_pers	;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setVat_gubun(String vat_gubun){
		this.vat_gubun = vat_gubun;
	}

	public void setTmsg_type(String tmsg_type){
		this.tmsg_type = tmsg_type;
	}

	public void setStmt_clsf(String stmt_clsf){
		this.stmt_clsf = stmt_clsf;
	}

	public void setPers_clsf(String pers_clsf){
		this.pers_clsf = pers_clsf;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getVat_gubun(){
		return this.vat_gubun;
	}

	public String getTmsg_type(){
		return this.tmsg_type;
	}

	public String getStmt_clsf(){
		return this.stmt_clsf;
	}

	public String getPers_clsf(){
		return this.pers_clsf;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_SE_SAL_1740_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SAL_1740_ADM dm = (SE_SAL_1740_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString( 3, dm.cmpy_cd		);
		cstmt.setString( 4, dm.yymm			);
		cstmt.setString( 5, dm.gubun		);
		cstmt.setString( 6, dm.vat_gubun	);
		cstmt.setString( 7, dm.correct_gubun);
		cstmt.setString( 8, dm.tmsg_type	);
		cstmt.setString( 9, dm.stmt_clsf	);
		cstmt.setString(10, dm.pers_clsf	);
		cstmt.setString(11, dm.semuro_id	);
		cstmt.setString(12, dm.incmg_pers_ip);
		cstmt.setString(13, dm.incmg_pers	);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.sal.ds.SE_SAL_1740_ADataSet();
	}

    public void print(){
        System.out.println("cmpy_cd 		= " + getCmpy_cd		());
        System.out.println("yymm 			= " + getYymm			());
        System.out.println("gubun 			= " + getGubun			());
        System.out.println("vat_gubun 		= " + getVat_gubun		());
        System.out.println("correct_gubun	= " + getCorrect_gubun	());
        System.out.println("tmsg_type 		= " + getTmsg_type		());
        System.out.println("stmt_clsf 		= " + getStmt_clsf		());
        System.out.println("pers_clsf 		= " + getPers_clsf		());
        System.out.println("semuro_id 		= " + getSemuro_id		());
        System.out.println("incmg_pers_ip 	= " + getIncmg_pers_ip	());
        System.out.println("incmg_pers 		= " + getIncmg_pers		());
    }
	public String getCorrect_gubun() {
		return correct_gubun;
	}
	public void setCorrect_gubun(String correct_gubun) {
		this.correct_gubun = correct_gubun;
	}
	public String getSemuro_id() {
		return semuro_id;
	}
	public void setSemuro_id(String semuro_id) {
		this.semuro_id = semuro_id;
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
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String vat_gubun = req.getParameter("vat_gubun");
if( vat_gubun == null){
	System.out.println(this.toString+" : vat_gubun is null" );
}else{
	System.out.println(this.toString+" : vat_gubun is "+vat_gubun );
}
String tmsg_type = req.getParameter("tmsg_type");
if( tmsg_type == null){
	System.out.println(this.toString+" : tmsg_type is null" );
}else{
	System.out.println(this.toString+" : tmsg_type is "+tmsg_type );
}
String stmt_clsf = req.getParameter("stmt_clsf");
if( stmt_clsf == null){
	System.out.println(this.toString+" : stmt_clsf is null" );
}else{
	System.out.println(this.toString+" : stmt_clsf is "+stmt_clsf );
}
String pers_clsf = req.getParameter("pers_clsf");
if( pers_clsf == null){
	System.out.println(this.toString+" : pers_clsf is null" );
}else{
	System.out.println(this.toString+" : pers_clsf is "+pers_clsf );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String gubun = Util.checkString(req.getParameter("gubun"));
String vat_gubun = Util.checkString(req.getParameter("vat_gubun"));
String tmsg_type = Util.checkString(req.getParameter("tmsg_type"));
String stmt_clsf = Util.checkString(req.getParameter("stmt_clsf"));
String pers_clsf = Util.checkString(req.getParameter("pers_clsf"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String vat_gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_gubun")));
String tmsg_type = Util.Uni2Ksc(Util.checkString(req.getParameter("tmsg_type")));
String stmt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("stmt_clsf")));
String pers_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pers_clsf")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setGubun(gubun);
dm.setVat_gubun(vat_gubun);
dm.setTmsg_type(tmsg_type);
dm.setStmt_clsf(stmt_clsf);
dm.setPers_clsf(pers_clsf);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 21 18:02:01 KST 2009 */