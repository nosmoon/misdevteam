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


public class TN_LNK_6095_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String seq;
	public String promiseidx;
	public String header;
	public String file_data;
	public String tail;
	public String incmg_pers;

	public TN_LNK_6095_ADM(){}
	public TN_LNK_6095_ADM(String seq, String promiseidx, String header, String file_data, String tail, String incmg_pers){
		this.seq = seq;
		this.promiseidx = promiseidx;
		this.header = header;
		this.file_data = file_data;
		this.tail = tail;
		this.incmg_pers = incmg_pers;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setPromiseidx(String promiseidx){
		this.promiseidx = promiseidx;
	}

	public void setHeader(String header){
		this.header = header;
	}

	public void setFile_data(String file_data){
		this.file_data = file_data;
	}

	public void setTail(String tail){
		this.tail = tail;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getPromiseidx(){
		return this.promiseidx;
	}

	public String getHeader(){
		return this.header;
	}

	public String getFile_data(){
		return this.file_data;
	}

	public String getTail(){
		return this.tail;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_6095_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_6095_ADM dm = (TN_LNK_6095_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.seq);
		cstmt.setString(4, dm.promiseidx);
		cstmt.setString(5, dm.header);
		cstmt.setString(6, dm.file_data);
		cstmt.setString(7, dm.tail);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_6095_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("promiseidx = [" + getPromiseidx() + "]");
		System.out.println("header = [" + getHeader() + "]");
		System.out.println("file_data = [" + getFile_data() + "]");
		System.out.println("tail = [" + getTail() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String promiseidx = req.getParameter("promiseidx");
if( promiseidx == null){
	System.out.println(this.toString+" : promiseidx is null" );
}else{
	System.out.println(this.toString+" : promiseidx is "+promiseidx );
}
String header = req.getParameter("header");
if( header == null){
	System.out.println(this.toString+" : header is null" );
}else{
	System.out.println(this.toString+" : header is "+header );
}
String file_data = req.getParameter("file_data");
if( file_data == null){
	System.out.println(this.toString+" : file_data is null" );
}else{
	System.out.println(this.toString+" : file_data is "+file_data );
}
String tail = req.getParameter("tail");
if( tail == null){
	System.out.println(this.toString+" : tail is null" );
}else{
	System.out.println(this.toString+" : tail is "+tail );
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

String seq = Util.checkString(req.getParameter("seq"));
String promiseidx = Util.checkString(req.getParameter("promiseidx"));
String header = Util.checkString(req.getParameter("header"));
String file_data = Util.checkString(req.getParameter("file_data"));
String tail = Util.checkString(req.getParameter("tail"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String promiseidx = Util.Uni2Ksc(Util.checkString(req.getParameter("promiseidx")));
String header = Util.Uni2Ksc(Util.checkString(req.getParameter("header")));
String file_data = Util.Uni2Ksc(Util.checkString(req.getParameter("file_data")));
String tail = Util.Uni2Ksc(Util.checkString(req.getParameter("tail")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSeq(seq);
dm.setPromiseidx(promiseidx);
dm.setHeader(header);
dm.setFile_data(file_data);
dm.setTail(tail);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Nov 29 11:11:00 KST 2016 */