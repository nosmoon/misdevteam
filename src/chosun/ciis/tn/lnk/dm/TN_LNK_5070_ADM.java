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


package chosun.ciis.tn.lnk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.ds.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_5070_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String cnclclsf;
	public String sdsiidx;
	public String sdsipaymentidx;
	public String promiseidx;
	public String incmg_pers_addr;
	public String incmg_pers;

	public TN_LNK_5070_ADM(){}
	public TN_LNK_5070_ADM(String cmpy_cd, String cnclclsf, String sdsiidx, String sdsipaymentidx, String promiseidx, String incmg_pers_addr, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.cnclclsf = cnclclsf;
		this.sdsiidx = sdsiidx;
		this.sdsipaymentidx = sdsipaymentidx;
		this.promiseidx = promiseidx;
		this.incmg_pers_addr = incmg_pers_addr;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCnclclsf(String cnclclsf){
		this.cnclclsf = cnclclsf;
	}

	public void setSdsiidx(String sdsiidx){
		this.sdsiidx = sdsiidx;
	}

	public void setSdsipaymentidx(String sdsipaymentidx){
		this.sdsipaymentidx = sdsipaymentidx;
	}

	public void setPromiseidx(String promiseidx){
		this.promiseidx = promiseidx;
	}

	public void setIncmg_pers_addr(String incmg_pers_addr){
		this.incmg_pers_addr = incmg_pers_addr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCnclclsf(){
		return this.cnclclsf;
	}

	public String getSdsiidx(){
		return this.sdsiidx;
	}

	public String getSdsipaymentidx(){
		return this.sdsipaymentidx;
	}

	public String getPromiseidx(){
		return this.promiseidx;
	}

	public String getIncmg_pers_addr(){
		return this.incmg_pers_addr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_5070_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_5070_ADM dm = (TN_LNK_5070_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.cnclclsf);
		cstmt.setString(5, dm.sdsiidx);
		cstmt.setString(6, dm.sdsipaymentidx);
		cstmt.setString(7, dm.promiseidx);
		cstmt.setString(8, dm.incmg_pers_addr);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, Types.INTEGER);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_5070_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("cnclclsf = [" + getCnclclsf() + "]");
		System.out.println("sdsiidx = [" + getSdsiidx() + "]");
		System.out.println("sdsipaymentidx = [" + getSdsipaymentidx() + "]");
		System.out.println("promiseidx = [" + getPromiseidx() + "]");
		System.out.println("incmg_pers_addr = [" + getIncmg_pers_addr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String cnclclsf = req.getParameter("cnclclsf");
if( cnclclsf == null){
	System.out.println(this.toString+" : cnclclsf is null" );
}else{
	System.out.println(this.toString+" : cnclclsf is "+cnclclsf );
}
String sdsiidx = req.getParameter("sdsiidx");
if( sdsiidx == null){
	System.out.println(this.toString+" : sdsiidx is null" );
}else{
	System.out.println(this.toString+" : sdsiidx is "+sdsiidx );
}
String sdsipaymentidx = req.getParameter("sdsipaymentidx");
if( sdsipaymentidx == null){
	System.out.println(this.toString+" : sdsipaymentidx is null" );
}else{
	System.out.println(this.toString+" : sdsipaymentidx is "+sdsipaymentidx );
}
String promiseidx = req.getParameter("promiseidx");
if( promiseidx == null){
	System.out.println(this.toString+" : promiseidx is null" );
}else{
	System.out.println(this.toString+" : promiseidx is "+promiseidx );
}
String incmg_pers_addr = req.getParameter("incmg_pers_addr");
if( incmg_pers_addr == null){
	System.out.println(this.toString+" : incmg_pers_addr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_addr is "+incmg_pers_addr );
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
String cnclclsf = Util.checkString(req.getParameter("cnclclsf"));
String sdsiidx = Util.checkString(req.getParameter("sdsiidx"));
String sdsipaymentidx = Util.checkString(req.getParameter("sdsipaymentidx"));
String promiseidx = Util.checkString(req.getParameter("promiseidx"));
String incmg_pers_addr = Util.checkString(req.getParameter("incmg_pers_addr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String cnclclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cnclclsf")));
String sdsiidx = Util.Uni2Ksc(Util.checkString(req.getParameter("sdsiidx")));
String sdsipaymentidx = Util.Uni2Ksc(Util.checkString(req.getParameter("sdsipaymentidx")));
String promiseidx = Util.Uni2Ksc(Util.checkString(req.getParameter("promiseidx")));
String incmg_pers_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_addr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCnclclsf(cnclclsf);
dm.setSdsiidx(sdsiidx);
dm.setSdsipaymentidx(sdsipaymentidx);
dm.setPromiseidx(promiseidx);
dm.setIncmg_pers_addr(incmg_pers_addr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Nov 03 10:16:44 KST 2016 */