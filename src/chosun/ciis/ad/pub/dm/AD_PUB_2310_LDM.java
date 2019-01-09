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


package chosun.ciis.ad.pub.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.ds.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_2310_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String select_dt;
	public String frdt;
	public String todt;
	public String misu;
	public String jikgulae;
	public String hndl_clsf;
	public String dlco_no;
	public String indt_clsf;
	public String std_clsf;
	public String book_appndx_clsf1;
	public String book_appndx_clsf2;

	public AD_PUB_2310_LDM(){}
	public AD_PUB_2310_LDM(String cmpy_cd, String medi_cd, String select_dt, String frdt, String todt, String misu, String jikgulae, String hndl_clsf, String dlco_no, String indt_clsf, String std_clsf, String book_appndx_clsf1, String book_appndx_clsf2){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.select_dt = select_dt;
		this.frdt = frdt;
		this.todt = todt;
		this.misu = misu;
		this.jikgulae = jikgulae;
		this.hndl_clsf = hndl_clsf;
		this.dlco_no = dlco_no;
		this.indt_clsf = indt_clsf;
		this.std_clsf = std_clsf;
		this.book_appndx_clsf1 = book_appndx_clsf1;
		this.book_appndx_clsf2 = book_appndx_clsf2;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSelect_dt(String select_dt){
		this.select_dt = select_dt;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setMisu(String misu){
		this.misu = misu;
	}

	public void setJikgulae(String jikgulae){
		this.jikgulae = jikgulae;
	}

	public void setHndl_clsf(String hndl_clsf){
		this.hndl_clsf = hndl_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setIndt_clsf(String indt_clsf){
		this.indt_clsf = indt_clsf;
	}

	public void setStd_clsf(String std_clsf){
		this.std_clsf = std_clsf;
	}

	public void setBook_appndx_clsf1(String book_appndx_clsf1){
		this.book_appndx_clsf1 = book_appndx_clsf1;
	}

	public void setBook_appndx_clsf2(String book_appndx_clsf2){
		this.book_appndx_clsf2 = book_appndx_clsf2;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSelect_dt(){
		return this.select_dt;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getMisu(){
		return this.misu;
	}

	public String getJikgulae(){
		return this.jikgulae;
	}

	public String getHndl_clsf(){
		return this.hndl_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getIndt_clsf(){
		return this.indt_clsf;
	}

	public String getStd_clsf(){
		return this.std_clsf;
	}

	public String getBook_appndx_clsf1(){
		return this.book_appndx_clsf1;
	}

	public String getBook_appndx_clsf2(){
		return this.book_appndx_clsf2;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_2310_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_2310_LDM dm = (AD_PUB_2310_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.select_dt);
		cstmt.setString(6, dm.frdt);
		cstmt.setString(7, dm.todt);
		cstmt.setString(8, dm.misu);
		cstmt.setString(9, dm.jikgulae);
		cstmt.setString(10, dm.hndl_clsf);
		cstmt.setString(11, dm.dlco_no);
		cstmt.setString(12, dm.indt_clsf);
		cstmt.setString(13, dm.std_clsf);
		cstmt.setString(14, dm.book_appndx_clsf1);
		cstmt.setString(15, dm.book_appndx_clsf2);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, Types.VARCHAR);
		cstmt.registerOutParameter(21, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_2310_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("select_dt = [" + getSelect_dt() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("misu = [" + getMisu() + "]");
		System.out.println("jikgulae = [" + getJikgulae() + "]");
		System.out.println("hndl_clsf = [" + getHndl_clsf() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("indt_clsf = [" + getIndt_clsf() + "]");
		System.out.println("std_clsf = [" + getStd_clsf() + "]");
		System.out.println("book_appndx_clsf1 = [" + getBook_appndx_clsf1() + "]");
		System.out.println("book_appndx_clsf2 = [" + getBook_appndx_clsf2() + "]");
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String select_dt = req.getParameter("select_dt");
if( select_dt == null){
	System.out.println(this.toString+" : select_dt is null" );
}else{
	System.out.println(this.toString+" : select_dt is "+select_dt );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String misu = req.getParameter("misu");
if( misu == null){
	System.out.println(this.toString+" : misu is null" );
}else{
	System.out.println(this.toString+" : misu is "+misu );
}
String jikgulae = req.getParameter("jikgulae");
if( jikgulae == null){
	System.out.println(this.toString+" : jikgulae is null" );
}else{
	System.out.println(this.toString+" : jikgulae is "+jikgulae );
}
String hndl_clsf = req.getParameter("hndl_clsf");
if( hndl_clsf == null){
	System.out.println(this.toString+" : hndl_clsf is null" );
}else{
	System.out.println(this.toString+" : hndl_clsf is "+hndl_clsf );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String indt_clsf = req.getParameter("indt_clsf");
if( indt_clsf == null){
	System.out.println(this.toString+" : indt_clsf is null" );
}else{
	System.out.println(this.toString+" : indt_clsf is "+indt_clsf );
}
String std_clsf = req.getParameter("std_clsf");
if( std_clsf == null){
	System.out.println(this.toString+" : std_clsf is null" );
}else{
	System.out.println(this.toString+" : std_clsf is "+std_clsf );
}
String book_appndx_clsf1 = req.getParameter("book_appndx_clsf1");
if( book_appndx_clsf1 == null){
	System.out.println(this.toString+" : book_appndx_clsf1 is null" );
}else{
	System.out.println(this.toString+" : book_appndx_clsf1 is "+book_appndx_clsf1 );
}
String book_appndx_clsf2 = req.getParameter("book_appndx_clsf2");
if( book_appndx_clsf2 == null){
	System.out.println(this.toString+" : book_appndx_clsf2 is null" );
}else{
	System.out.println(this.toString+" : book_appndx_clsf2 is "+book_appndx_clsf2 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String select_dt = Util.checkString(req.getParameter("select_dt"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String misu = Util.checkString(req.getParameter("misu"));
String jikgulae = Util.checkString(req.getParameter("jikgulae"));
String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String indt_clsf = Util.checkString(req.getParameter("indt_clsf"));
String std_clsf = Util.checkString(req.getParameter("std_clsf"));
String book_appndx_clsf1 = Util.checkString(req.getParameter("book_appndx_clsf1"));
String book_appndx_clsf2 = Util.checkString(req.getParameter("book_appndx_clsf2"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String select_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("select_dt")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String misu = Util.Uni2Ksc(Util.checkString(req.getParameter("misu")));
String jikgulae = Util.Uni2Ksc(Util.checkString(req.getParameter("jikgulae")));
String hndl_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hndl_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String indt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_clsf")));
String std_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("std_clsf")));
String book_appndx_clsf1 = Util.Uni2Ksc(Util.checkString(req.getParameter("book_appndx_clsf1")));
String book_appndx_clsf2 = Util.Uni2Ksc(Util.checkString(req.getParameter("book_appndx_clsf2")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setSelect_dt(select_dt);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setMisu(misu);
dm.setJikgulae(jikgulae);
dm.setHndl_clsf(hndl_clsf);
dm.setDlco_no(dlco_no);
dm.setIndt_clsf(indt_clsf);
dm.setStd_clsf(std_clsf);
dm.setBook_appndx_clsf1(book_appndx_clsf1);
dm.setBook_appndx_clsf2(book_appndx_clsf2);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 01 14:13:07 KST 2014 */