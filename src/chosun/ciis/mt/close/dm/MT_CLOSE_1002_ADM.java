/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mt.close.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.close.ds.*;
import chosun.ciis.mt.close.rec.*;

/**
 * 
 */


public class MT_CLOSE_1002_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String row;
	public String cmpy_cd;
	public String aply_from_dt;
	public String aply_to_dt;
	public String fac_clsf;
	public String matr_cd;
	public String shet_qunt;
	public String chemi_cd1;
	public String chemi_cd2;
	public String chemi_cd3;
	public String chemi_cd4;
	public String chemi_cd5;
	public String seq;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public MT_CLOSE_1002_ADM(){}
	public MT_CLOSE_1002_ADM(String mode, String row, String cmpy_cd, String aply_from_dt, String aply_to_dt, String fac_clsf, String matr_cd, String shet_qunt, String chemi_cd1, String chemi_cd2, String chemi_cd3, String chemi_cd4, String chemi_cd5, String seq, String incmg_pers_ipaddr, String incmg_pers){
		this.mode = mode;
		this.row = row;
		this.cmpy_cd = cmpy_cd;
		this.aply_from_dt = aply_from_dt;
		this.aply_to_dt = aply_to_dt;
		this.fac_clsf = fac_clsf;
		this.matr_cd = matr_cd;
		this.shet_qunt = shet_qunt;
		this.chemi_cd1 = chemi_cd1;
		this.chemi_cd2 = chemi_cd2;
		this.chemi_cd3 = chemi_cd3;
		this.chemi_cd4 = chemi_cd4;
		this.chemi_cd5 = chemi_cd5;
		this.seq = seq;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setRow(String row){
		this.row = row;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_from_dt(String aply_from_dt){
		this.aply_from_dt = aply_from_dt;
	}

	public void setAply_to_dt(String aply_to_dt){
		this.aply_to_dt = aply_to_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setShet_qunt(String shet_qunt){
		this.shet_qunt = shet_qunt;
	}

	public void setChemi_cd1(String chemi_cd1){
		this.chemi_cd1 = chemi_cd1;
	}

	public void setChemi_cd2(String chemi_cd2){
		this.chemi_cd2 = chemi_cd2;
	}

	public void setChemi_cd3(String chemi_cd3){
		this.chemi_cd3 = chemi_cd3;
	}

	public void setChemi_cd4(String chemi_cd4){
		this.chemi_cd4 = chemi_cd4;
	}

	public void setChemi_cd5(String chemi_cd5){
		this.chemi_cd5 = chemi_cd5;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getRow(){
		return this.row;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_from_dt(){
		return this.aply_from_dt;
	}

	public String getAply_to_dt(){
		return this.aply_to_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getShet_qunt(){
		return this.shet_qunt;
	}

	public String getChemi_cd1(){
		return this.chemi_cd1;
	}

	public String getChemi_cd2(){
		return this.chemi_cd2;
	}

	public String getChemi_cd3(){
		return this.chemi_cd3;
	}

	public String getChemi_cd4(){
		return this.chemi_cd4;
	}

	public String getChemi_cd5(){
		return this.chemi_cd5;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_CLOSE_1002_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_CLOSE_1002_ADM dm = (MT_CLOSE_1002_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.row);
		cstmt.setString(5, dm.cmpy_cd);
		cstmt.setString(6, dm.aply_from_dt);
		cstmt.setString(7, dm.aply_to_dt);
		cstmt.setString(8, dm.fac_clsf);
		cstmt.setString(9, dm.matr_cd);
		cstmt.setString(10, dm.shet_qunt);
		cstmt.setString(11, dm.chemi_cd1);
		cstmt.setString(12, dm.chemi_cd2);
		cstmt.setString(13, dm.chemi_cd3);
		cstmt.setString(14, dm.chemi_cd4);
		cstmt.setString(15, dm.chemi_cd5);
		cstmt.setString(16, dm.seq);
		cstmt.setString(17, dm.incmg_pers_ipaddr);
		cstmt.setString(18, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.close.ds.MT_CLOSE_1002_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("row = [" + getRow() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aply_from_dt = [" + getAply_from_dt() + "]");
		System.out.println("aply_to_dt = [" + getAply_to_dt() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("shet_qunt = [" + getShet_qunt() + "]");
		System.out.println("chemi_cd1 = [" + getChemi_cd1() + "]");
		System.out.println("chemi_cd2 = [" + getChemi_cd2() + "]");
		System.out.println("chemi_cd3 = [" + getChemi_cd3() + "]");
		System.out.println("chemi_cd4 = [" + getChemi_cd4() + "]");
		System.out.println("chemi_cd5 = [" + getChemi_cd5() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String row = req.getParameter("row");
if( row == null){
	System.out.println(this.toString+" : row is null" );
}else{
	System.out.println(this.toString+" : row is "+row );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String aply_from_dt = req.getParameter("aply_from_dt");
if( aply_from_dt == null){
	System.out.println(this.toString+" : aply_from_dt is null" );
}else{
	System.out.println(this.toString+" : aply_from_dt is "+aply_from_dt );
}
String aply_to_dt = req.getParameter("aply_to_dt");
if( aply_to_dt == null){
	System.out.println(this.toString+" : aply_to_dt is null" );
}else{
	System.out.println(this.toString+" : aply_to_dt is "+aply_to_dt );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String shet_qunt = req.getParameter("shet_qunt");
if( shet_qunt == null){
	System.out.println(this.toString+" : shet_qunt is null" );
}else{
	System.out.println(this.toString+" : shet_qunt is "+shet_qunt );
}
String chemi_cd1 = req.getParameter("chemi_cd1");
if( chemi_cd1 == null){
	System.out.println(this.toString+" : chemi_cd1 is null" );
}else{
	System.out.println(this.toString+" : chemi_cd1 is "+chemi_cd1 );
}
String chemi_cd2 = req.getParameter("chemi_cd2");
if( chemi_cd2 == null){
	System.out.println(this.toString+" : chemi_cd2 is null" );
}else{
	System.out.println(this.toString+" : chemi_cd2 is "+chemi_cd2 );
}
String chemi_cd3 = req.getParameter("chemi_cd3");
if( chemi_cd3 == null){
	System.out.println(this.toString+" : chemi_cd3 is null" );
}else{
	System.out.println(this.toString+" : chemi_cd3 is "+chemi_cd3 );
}
String chemi_cd4 = req.getParameter("chemi_cd4");
if( chemi_cd4 == null){
	System.out.println(this.toString+" : chemi_cd4 is null" );
}else{
	System.out.println(this.toString+" : chemi_cd4 is "+chemi_cd4 );
}
String chemi_cd5 = req.getParameter("chemi_cd5");
if( chemi_cd5 == null){
	System.out.println(this.toString+" : chemi_cd5 is null" );
}else{
	System.out.println(this.toString+" : chemi_cd5 is "+chemi_cd5 );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
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

String mode = Util.checkString(req.getParameter("mode"));
String row = Util.checkString(req.getParameter("row"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aply_from_dt = Util.checkString(req.getParameter("aply_from_dt"));
String aply_to_dt = Util.checkString(req.getParameter("aply_to_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String shet_qunt = Util.checkString(req.getParameter("shet_qunt"));
String chemi_cd1 = Util.checkString(req.getParameter("chemi_cd1"));
String chemi_cd2 = Util.checkString(req.getParameter("chemi_cd2"));
String chemi_cd3 = Util.checkString(req.getParameter("chemi_cd3"));
String chemi_cd4 = Util.checkString(req.getParameter("chemi_cd4"));
String chemi_cd5 = Util.checkString(req.getParameter("chemi_cd5"));
String seq = Util.checkString(req.getParameter("seq"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String row = Util.Uni2Ksc(Util.checkString(req.getParameter("row")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aply_from_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_from_dt")));
String aply_to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_to_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String shet_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("shet_qunt")));
String chemi_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("chemi_cd1")));
String chemi_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("chemi_cd2")));
String chemi_cd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("chemi_cd3")));
String chemi_cd4 = Util.Uni2Ksc(Util.checkString(req.getParameter("chemi_cd4")));
String chemi_cd5 = Util.Uni2Ksc(Util.checkString(req.getParameter("chemi_cd5")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setRow(row);
dm.setCmpy_cd(cmpy_cd);
dm.setAply_from_dt(aply_from_dt);
dm.setAply_to_dt(aply_to_dt);
dm.setFac_clsf(fac_clsf);
dm.setMatr_cd(matr_cd);
dm.setShet_qunt(shet_qunt);
dm.setChemi_cd1(chemi_cd1);
dm.setChemi_cd2(chemi_cd2);
dm.setChemi_cd3(chemi_cd3);
dm.setChemi_cd4(chemi_cd4);
dm.setChemi_cd5(chemi_cd5);
dm.setSeq(seq);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 09 20:40:37 KST 2009 */