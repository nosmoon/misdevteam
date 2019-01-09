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


package chosun.ciis.tn.dns.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.dns.ds.*;
import chosun.ciis.tn.dns.rec.*;

/**
 * 
 */


public class TN_DNS_1070_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String accflag;
	public String promiseidx;
	public String prooftype;
	public String cmsidx;
	public String proofname;
	public String proofpath;
	public String proofsize;
	public String extension;
	public byte[] proofdata;
	public String incmg_pers;

	public TN_DNS_1070_ADM(){}
	public TN_DNS_1070_ADM(String cmpy_cd, String accflag, String promiseidx, String prooftype, String cmsidx, String proofname, String proofpath, String proofsize, String extension, byte[] proofdata, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.accflag = accflag;
		this.promiseidx = promiseidx;
		this.prooftype = prooftype;
		this.cmsidx = cmsidx;
		this.proofname = proofname;
		this.proofpath = proofpath;
		this.proofsize = proofsize;
		this.extension = extension;
		this.proofdata = proofdata;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setPromiseidx(String promiseidx){
		this.promiseidx = promiseidx;
	}

	public void setProoftype(String prooftype){
		this.prooftype = prooftype;
	}

	public void setCmsidx(String cmsidx){
		this.cmsidx = cmsidx;
	}

	public void setProofname(String proofname){
		this.proofname = proofname;
	}

	public void setProofpath(String proofpath){
		this.proofpath = proofpath;
	}

	public void setProofsize(String proofsize){
		this.proofsize = proofsize;
	}

	public void setExtension(String extension){
		this.extension = extension;
	}

	public void setProofdata(byte[] proofdata){
		this.proofdata = proofdata;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getPromiseidx(){
		return this.promiseidx;
	}

	public String getProoftype(){
		return this.prooftype;
	}

	public String getCmsidx(){
		return this.cmsidx;
	}

	public String getProofname(){
		return this.proofname;
	}

	public String getProofpath(){
		return this.proofpath;
	}

	public String getProofsize(){
		return this.proofsize;
	}

	public String getExtension(){
		return this.extension;
	}

	public byte[] getProofdata(){
		return this.proofdata;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_DNS_1070_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_DNS_1070_ADM dm = (TN_DNS_1070_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.promiseidx);
		cstmt.setString(6, dm.prooftype);
		cstmt.setString(7, dm.cmsidx);
		cstmt.setString(8, dm.proofname);
		cstmt.setString(9, dm.proofpath);
		cstmt.setString(10, dm.proofsize);
		cstmt.setString(11, dm.extension);
		cstmt.setBytes(12, "1010".getBytes());
		cstmt.setString(13, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.dns.ds.TN_DNS_1070_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("accflag = [" + getAccflag() + "]");
		System.out.println("promiseidx = [" + getPromiseidx() + "]");
		System.out.println("prooftype = [" + getProoftype() + "]");
		System.out.println("cmsidx = [" + getCmsidx() + "]");
		System.out.println("proofname = [" + getProofname() + "]");
		System.out.println("proofpath = [" + getProofpath() + "]");
		System.out.println("proofsize = [" + getProofsize() + "]");
		System.out.println("extension = [" + getExtension() + "]");
		System.out.println("proofdata = [" + getProofdata() + "]");
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
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String promiseidx = req.getParameter("promiseidx");
if( promiseidx == null){
	System.out.println(this.toString+" : promiseidx is null" );
}else{
	System.out.println(this.toString+" : promiseidx is "+promiseidx );
}
String prooftype = req.getParameter("prooftype");
if( prooftype == null){
	System.out.println(this.toString+" : prooftype is null" );
}else{
	System.out.println(this.toString+" : prooftype is "+prooftype );
}
String cmsidx = req.getParameter("cmsidx");
if( cmsidx == null){
	System.out.println(this.toString+" : cmsidx is null" );
}else{
	System.out.println(this.toString+" : cmsidx is "+cmsidx );
}
String proofname = req.getParameter("proofname");
if( proofname == null){
	System.out.println(this.toString+" : proofname is null" );
}else{
	System.out.println(this.toString+" : proofname is "+proofname );
}
String proofpath = req.getParameter("proofpath");
if( proofpath == null){
	System.out.println(this.toString+" : proofpath is null" );
}else{
	System.out.println(this.toString+" : proofpath is "+proofpath );
}
String proofsize = req.getParameter("proofsize");
if( proofsize == null){
	System.out.println(this.toString+" : proofsize is null" );
}else{
	System.out.println(this.toString+" : proofsize is "+proofsize );
}
String extension = req.getParameter("extension");
if( extension == null){
	System.out.println(this.toString+" : extension is null" );
}else{
	System.out.println(this.toString+" : extension is "+extension );
}
String proofdata = req.getParameter("proofdata");
if( proofdata == null){
	System.out.println(this.toString+" : proofdata is null" );
}else{
	System.out.println(this.toString+" : proofdata is "+proofdata );
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
String accflag = Util.checkString(req.getParameter("accflag"));
String promiseidx = Util.checkString(req.getParameter("promiseidx"));
String prooftype = Util.checkString(req.getParameter("prooftype"));
String cmsidx = Util.checkString(req.getParameter("cmsidx"));
String proofname = Util.checkString(req.getParameter("proofname"));
String proofpath = Util.checkString(req.getParameter("proofpath"));
String proofsize = Util.checkString(req.getParameter("proofsize"));
String extension = Util.checkString(req.getParameter("extension"));
String proofdata = Util.checkString(req.getParameter("proofdata"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String promiseidx = Util.Uni2Ksc(Util.checkString(req.getParameter("promiseidx")));
String prooftype = Util.Uni2Ksc(Util.checkString(req.getParameter("prooftype")));
String cmsidx = Util.Uni2Ksc(Util.checkString(req.getParameter("cmsidx")));
String proofname = Util.Uni2Ksc(Util.checkString(req.getParameter("proofname")));
String proofpath = Util.Uni2Ksc(Util.checkString(req.getParameter("proofpath")));
String proofsize = Util.Uni2Ksc(Util.checkString(req.getParameter("proofsize")));
String extension = Util.Uni2Ksc(Util.checkString(req.getParameter("extension")));
String proofdata = Util.Uni2Ksc(Util.checkString(req.getParameter("proofdata")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAccflag(accflag);
dm.setPromiseidx(promiseidx);
dm.setProoftype(prooftype);
dm.setCmsidx(cmsidx);
dm.setProofname(proofname);
dm.setProofpath(proofpath);
dm.setProofsize(proofsize);
dm.setExtension(extension);
dm.setProofdata(proofdata);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 05 10:35:36 KST 2016 */