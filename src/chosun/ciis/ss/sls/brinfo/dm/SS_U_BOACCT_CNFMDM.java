/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * 
 */


public class SS_U_BOACCT_CNFMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String uid;
	public String bocd;
	public String seq;
	public String acctitem;

	public SS_U_BOACCT_CNFMDM(){}
	public SS_U_BOACCT_CNFMDM(String uid, String bocd, String seq, String acctitem){
		this.uid = uid;
		this.bocd = bocd;
		this.seq = seq;
		this.acctitem = acctitem;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setAcctitem(String acctitem){
		this.acctitem = acctitem;
	}

	public String getUid(){
		return this.uid;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getAcctitem(){
		return this.acctitem;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_U_BOACCT_CNFM(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_BOACCT_CNFMDM dm = (SS_U_BOACCT_CNFMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.uid);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.acctitem);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brinfo.ds.SS_U_BOACCT_CNFMDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("uid = [" + getUid() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("acctitem = [" + getAcctitem() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String acctitem = req.getParameter("acctitem");
if( acctitem == null){
	System.out.println(this.toString+" : acctitem is null" );
}else{
	System.out.println(this.toString+" : acctitem is "+acctitem );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String uid = Util.checkString(req.getParameter("uid"));
String bocd = Util.checkString(req.getParameter("bocd"));
String seq = Util.checkString(req.getParameter("seq"));
String acctitem = Util.checkString(req.getParameter("acctitem"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String acctitem = Util.Uni2Ksc(Util.checkString(req.getParameter("acctitem")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setUid(uid);
dm.setBocd(bocd);
dm.setSeq(seq);
dm.setAcctitem(acctitem);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 19 16:28:04 KST 2017 */