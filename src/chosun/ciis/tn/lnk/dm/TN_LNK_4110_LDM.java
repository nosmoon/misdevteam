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


public class TN_LNK_4110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String status;
	public String startdate_fr;
	public String startdate_to;
	public String title;

	public TN_LNK_4110_LDM(){}
	public TN_LNK_4110_LDM(String cmpy_cd, String status, String startdate_fr, String startdate_to, String title){
		this.cmpy_cd = cmpy_cd;
		this.status = status;
		this.startdate_fr = startdate_fr;
		this.startdate_to = startdate_to;
		this.title = title;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public void setStartdate_fr(String startdate_fr){
		this.startdate_fr = startdate_fr;
	}

	public void setStartdate_to(String startdate_to){
		this.startdate_to = startdate_to;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getStatus(){
		return this.status;
	}

	public String getStartdate_fr(){
		return this.startdate_fr;
	}

	public String getStartdate_to(){
		return this.startdate_to;
	}

	public String getTitle(){
		return this.title;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_4110_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_4110_LDM dm = (TN_LNK_4110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.status);
		cstmt.setString(5, dm.startdate_fr);
		cstmt.setString(6, dm.startdate_to);
		cstmt.setString(7, dm.title);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_4110_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("status = [" + getStatus() + "]");
		System.out.println("startdate_fr = [" + getStartdate_fr() + "]");
		System.out.println("startdate_to = [" + getStartdate_to() + "]");
		System.out.println("title = [" + getTitle() + "]");
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
String status = req.getParameter("status");
if( status == null){
	System.out.println(this.toString+" : status is null" );
}else{
	System.out.println(this.toString+" : status is "+status );
}
String startdate_fr = req.getParameter("startdate_fr");
if( startdate_fr == null){
	System.out.println(this.toString+" : startdate_fr is null" );
}else{
	System.out.println(this.toString+" : startdate_fr is "+startdate_fr );
}
String startdate_to = req.getParameter("startdate_to");
if( startdate_to == null){
	System.out.println(this.toString+" : startdate_to is null" );
}else{
	System.out.println(this.toString+" : startdate_to is "+startdate_to );
}
String title = req.getParameter("title");
if( title == null){
	System.out.println(this.toString+" : title is null" );
}else{
	System.out.println(this.toString+" : title is "+title );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String status = Util.checkString(req.getParameter("status"));
String startdate_fr = Util.checkString(req.getParameter("startdate_fr"));
String startdate_to = Util.checkString(req.getParameter("startdate_to"));
String title = Util.checkString(req.getParameter("title"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String status = Util.Uni2Ksc(Util.checkString(req.getParameter("status")));
String startdate_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("startdate_fr")));
String startdate_to = Util.Uni2Ksc(Util.checkString(req.getParameter("startdate_to")));
String title = Util.Uni2Ksc(Util.checkString(req.getParameter("title")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setStatus(status);
dm.setStartdate_fr(startdate_fr);
dm.setStartdate_to(startdate_to);
dm.setTitle(title);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 18 20:21:21 KST 2016 */