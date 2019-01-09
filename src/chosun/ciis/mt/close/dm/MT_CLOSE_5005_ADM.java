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


public class MT_CLOSE_5005_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String row;
	public String cmpy_cd;
	public String aply_dt;
	public String fac_clsf;
	public String matr_cd;
	public String medi_cd;
	public String sect_cd;
	public String qunt;
	public String amt;
	public String ewh_budg_cd;
	public String owh_budg_cd;
	public String dstb_rat_cd;
	public String owh_dept;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public MT_CLOSE_5005_ADM(){}
	public MT_CLOSE_5005_ADM(String mode, String row, String cmpy_cd, String aply_dt, String fac_clsf, String matr_cd, String medi_cd, String sect_cd, String qunt, String amt, String ewh_budg_cd, String owh_budg_cd, String dstb_rat_cd, String owh_dept, String incmg_pers_ipaddr, String incmg_pers){
		this.mode = mode;
		this.row = row;
		this.cmpy_cd = cmpy_cd;
		this.aply_dt = aply_dt;
		this.fac_clsf = fac_clsf;
		this.matr_cd = matr_cd;
		this.medi_cd = medi_cd;
		this.sect_cd = sect_cd;
		this.qunt = qunt;
		this.amt = amt;
		this.ewh_budg_cd = ewh_budg_cd;
		this.owh_budg_cd = owh_budg_cd;
		this.dstb_rat_cd = dstb_rat_cd;
		this.owh_dept = owh_dept;
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

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setEwh_budg_cd(String ewh_budg_cd){
		this.ewh_budg_cd = ewh_budg_cd;
	}

	public void setOwh_budg_cd(String owh_budg_cd){
		this.owh_budg_cd = owh_budg_cd;
	}

	public void setDstb_rat_cd(String dstb_rat_cd){
		this.dstb_rat_cd = dstb_rat_cd;
	}

	public void setOwh_dept(String owh_dept){
		this.owh_dept = owh_dept;
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

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getEwh_budg_cd(){
		return this.ewh_budg_cd;
	}

	public String getOwh_budg_cd(){
		return this.owh_budg_cd;
	}

	public String getDstb_rat_cd(){
		return this.dstb_rat_cd;
	}

	public String getOwh_dept(){
		return this.owh_dept;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_CLOSE_5005_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_CLOSE_5005_ADM dm = (MT_CLOSE_5005_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.row);
		cstmt.setString(5, dm.cmpy_cd);
		cstmt.setString(6, dm.aply_dt);
		cstmt.setString(7, dm.fac_clsf);
		cstmt.setString(8, dm.matr_cd);
		cstmt.setString(9, dm.medi_cd);
		cstmt.setString(10, dm.sect_cd);
		cstmt.setString(11, dm.qunt);
		cstmt.setString(12, dm.amt);
		cstmt.setString(13, dm.ewh_budg_cd);
		cstmt.setString(14, dm.owh_budg_cd);
		cstmt.setString(15, dm.dstb_rat_cd);
		cstmt.setString(16, dm.owh_dept);
		cstmt.setString(17, dm.incmg_pers_ipaddr);
		cstmt.setString(18, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.close.ds.MT_CLOSE_5005_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("row = [" + getRow() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aply_dt = [" + getAply_dt() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
		System.out.println("qunt = [" + getQunt() + "]");
		System.out.println("amt = [" + getAmt() + "]");
		System.out.println("ewh_budg_cd = [" + getEwh_budg_cd() + "]");
		System.out.println("owh_budg_cd = [" + getOwh_budg_cd() + "]");
		System.out.println("dstb_rat_cd = [" + getDstb_rat_cd() + "]");
		System.out.println("owh_dept = [" + getOwh_dept() + "]");
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
String aply_dt = req.getParameter("aply_dt");
if( aply_dt == null){
	System.out.println(this.toString+" : aply_dt is null" );
}else{
	System.out.println(this.toString+" : aply_dt is "+aply_dt );
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String sect_cd = req.getParameter("sect_cd");
if( sect_cd == null){
	System.out.println(this.toString+" : sect_cd is null" );
}else{
	System.out.println(this.toString+" : sect_cd is "+sect_cd );
}
String qunt = req.getParameter("qunt");
if( qunt == null){
	System.out.println(this.toString+" : qunt is null" );
}else{
	System.out.println(this.toString+" : qunt is "+qunt );
}
String amt = req.getParameter("amt");
if( amt == null){
	System.out.println(this.toString+" : amt is null" );
}else{
	System.out.println(this.toString+" : amt is "+amt );
}
String ewh_budg_cd = req.getParameter("ewh_budg_cd");
if( ewh_budg_cd == null){
	System.out.println(this.toString+" : ewh_budg_cd is null" );
}else{
	System.out.println(this.toString+" : ewh_budg_cd is "+ewh_budg_cd );
}
String owh_budg_cd = req.getParameter("owh_budg_cd");
if( owh_budg_cd == null){
	System.out.println(this.toString+" : owh_budg_cd is null" );
}else{
	System.out.println(this.toString+" : owh_budg_cd is "+owh_budg_cd );
}
String dstb_rat_cd = req.getParameter("dstb_rat_cd");
if( dstb_rat_cd == null){
	System.out.println(this.toString+" : dstb_rat_cd is null" );
}else{
	System.out.println(this.toString+" : dstb_rat_cd is "+dstb_rat_cd );
}
String owh_dept = req.getParameter("owh_dept");
if( owh_dept == null){
	System.out.println(this.toString+" : owh_dept is null" );
}else{
	System.out.println(this.toString+" : owh_dept is "+owh_dept );
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
String aply_dt = Util.checkString(req.getParameter("aply_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String qunt = Util.checkString(req.getParameter("qunt"));
String amt = Util.checkString(req.getParameter("amt"));
String ewh_budg_cd = Util.checkString(req.getParameter("ewh_budg_cd"));
String owh_budg_cd = Util.checkString(req.getParameter("owh_budg_cd"));
String dstb_rat_cd = Util.checkString(req.getParameter("dstb_rat_cd"));
String owh_dept = Util.checkString(req.getParameter("owh_dept"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String row = Util.Uni2Ksc(Util.checkString(req.getParameter("row")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aply_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt")));
String amt = Util.Uni2Ksc(Util.checkString(req.getParameter("amt")));
String ewh_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_budg_cd")));
String owh_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_budg_cd")));
String dstb_rat_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dstb_rat_cd")));
String owh_dept = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_dept")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setRow(row);
dm.setCmpy_cd(cmpy_cd);
dm.setAply_dt(aply_dt);
dm.setFac_clsf(fac_clsf);
dm.setMatr_cd(matr_cd);
dm.setMedi_cd(medi_cd);
dm.setSect_cd(sect_cd);
dm.setQunt(qunt);
dm.setAmt(amt);
dm.setEwh_budg_cd(ewh_budg_cd);
dm.setOwh_budg_cd(owh_budg_cd);
dm.setDstb_rat_cd(dstb_rat_cd);
dm.setOwh_dept(owh_dept);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 10 16:39:15 KST 2009 */