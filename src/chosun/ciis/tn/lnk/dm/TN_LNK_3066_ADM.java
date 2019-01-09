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


public class TN_LNK_3066_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String filenm;
	public String seq;
	public String filedata;
	public String incmg_pers;

	public TN_LNK_3066_ADM(){}
	public TN_LNK_3066_ADM(String filenm, String seq, String filedata, String incmg_pers){
		this.filenm = filenm;
		this.seq = seq;
		this.filedata = filedata;
		this.incmg_pers = incmg_pers;
	}

	public void setFilenm(String filenm){
		this.filenm = filenm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFiledata(String filedata){
		this.filedata = filedata;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getFilenm(){
		return this.filenm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFiledata(){
		return this.filedata;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_3066_A(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_3066_ADM dm = (TN_LNK_3066_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.filenm);
		cstmt.setString(4, dm.seq);
		cstmt.setString(5, dm.filedata);
		cstmt.setString(6, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_3066_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("filenm = [" + getFilenm() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("filedata = [" + getFiledata() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String filenm = req.getParameter("filenm");
if( filenm == null){
	System.out.println(this.toString+" : filenm is null" );
}else{
	System.out.println(this.toString+" : filenm is "+filenm );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String filedata = req.getParameter("filedata");
if( filedata == null){
	System.out.println(this.toString+" : filedata is null" );
}else{
	System.out.println(this.toString+" : filedata is "+filedata );
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

String filenm = Util.checkString(req.getParameter("filenm"));
String seq = Util.checkString(req.getParameter("seq"));
String filedata = Util.checkString(req.getParameter("filedata"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String filenm = Util.Uni2Ksc(Util.checkString(req.getParameter("filenm")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String filedata = Util.Uni2Ksc(Util.checkString(req.getParameter("filedata")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFilenm(filenm);
dm.setSeq(seq);
dm.setFiledata(filedata);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Oct 07 15:44:41 KST 2016 */