/***************************************************************************************************
* 파일명 : .java
* 기능 : 사원확장비 기관신규등록
* 작성일자 : 2009-05-29
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 사원확장비 기관신규등록
 */

public class SS_I_EXTN_COSTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String uid;
	public String medicd;
	public String rdr_extnbgndd;
	public String rdr_extnto_dd;
	public String rdr_extncampnm;
	public String rdr_extncost;
	public String remk;

	public SS_I_EXTN_COSTDM(){}
	public SS_I_EXTN_COSTDM(String cmpycd, String uid, String medicd, String rdr_extnbgndd, String rdr_extnto_dd, String rdr_extncampnm, String rdr_extncost, String remk){
		this.cmpycd = cmpycd;
		this.uid = uid;
		this.medicd = medicd;
		this.rdr_extnbgndd = rdr_extnbgndd;
		this.rdr_extnto_dd = rdr_extnto_dd;
		this.rdr_extncampnm = rdr_extncampnm;
		this.rdr_extncost = rdr_extncost;
		this.remk = remk;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setRdr_extnbgndd(String rdr_extnbgndd){
		this.rdr_extnbgndd = rdr_extnbgndd;
	}

	public void setRdr_extnto_dd(String rdr_extnto_dd){
		this.rdr_extnto_dd = rdr_extnto_dd;
	}

	public void setRdr_extncampnm(String rdr_extncampnm){
		this.rdr_extncampnm = rdr_extncampnm;
	}

	public void setRdr_extncost(String rdr_extncost){
		this.rdr_extncost = rdr_extncost;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getUid(){
		return this.uid;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getRdr_extnbgndd(){
		return this.rdr_extnbgndd;
	}

	public String getRdr_extnto_dd(){
		return this.rdr_extnto_dd;
	}

	public String getRdr_extncampnm(){
		return this.rdr_extncampnm;
	}

	public String getRdr_extncost(){
		return this.rdr_extncost;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSQL(){
		 return "{ call SP_SS_I_EXTN_COST( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_I_EXTN_COSTDM dm = (SS_I_EXTN_COSTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.uid);
		cstmt.setString(5, dm.medicd);
		cstmt.setString(6, dm.rdr_extnbgndd);
		cstmt.setString(7, dm.rdr_extnto_dd);
		cstmt.setString(8, dm.rdr_extncampnm);
		cstmt.setString(9, dm.rdr_extncost);
		cstmt.setString(10, dm.remk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_I_EXTN_COSTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String rdr_extnbgndd = req.getParameter("rdr_extnbgndd");
if( rdr_extnbgndd == null){
	System.out.println(this.toString+" : rdr_extnbgndd is null" );
}else{
	System.out.println(this.toString+" : rdr_extnbgndd is "+rdr_extnbgndd );
}
String rdr_extnto_dd = req.getParameter("rdr_extnto_dd");
if( rdr_extnto_dd == null){
	System.out.println(this.toString+" : rdr_extnto_dd is null" );
}else{
	System.out.println(this.toString+" : rdr_extnto_dd is "+rdr_extnto_dd );
}
String rdr_extncampnm = req.getParameter("rdr_extncampnm");
if( rdr_extncampnm == null){
	System.out.println(this.toString+" : rdr_extncampnm is null" );
}else{
	System.out.println(this.toString+" : rdr_extncampnm is "+rdr_extncampnm );
}
String rdr_extncost = req.getParameter("rdr_extncost");
if( rdr_extncost == null){
	System.out.println(this.toString+" : rdr_extncost is null" );
}else{
	System.out.println(this.toString+" : rdr_extncost is "+rdr_extncost );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String uid = Util.checkString(req.getParameter("uid"));
String medicd = Util.checkString(req.getParameter("medicd"));
String rdr_extnbgndd = Util.checkString(req.getParameter("rdr_extnbgndd"));
String rdr_extnto_dd = Util.checkString(req.getParameter("rdr_extnto_dd"));
String rdr_extncampnm = Util.checkString(req.getParameter("rdr_extncampnm"));
String rdr_extncost = Util.checkString(req.getParameter("rdr_extncost"));
String remk = Util.checkString(req.getParameter("remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String rdr_extnbgndd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnbgndd")));
String rdr_extnto_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnto_dd")));
String rdr_extncampnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extncampnm")));
String rdr_extncost = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extncost")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setUid(uid);
dm.setMedicd(medicd);
dm.setRdr_extnbgndd(rdr_extnbgndd);
dm.setRdr_extnto_dd(rdr_extnto_dd);
dm.setRdr_extncampnm(rdr_extncampnm);
dm.setRdr_extncost(rdr_extncost);
dm.setRemk(remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 29 17:21:31 KST 2009 */