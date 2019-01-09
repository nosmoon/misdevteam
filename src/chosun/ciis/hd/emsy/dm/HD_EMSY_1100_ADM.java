

package chosun.ciis.hd.emsy.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.emsy.ds.*;
import chosun.ciis.hd.emsy.rec.*;

/**
 * 
 */


public class HD_EMSY_1100_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String saly_yy;
	public String saly_no;
	public String sfromemail;
	public String smailsubject;
	public String smailcontent;

	public HD_EMSY_1100_ADM(){}
	public HD_EMSY_1100_ADM(String cmpy_cd, String saly_yy, String saly_no, String sfromemail, String smailsubject, String smailcontent){
		this.cmpy_cd = cmpy_cd;
		this.saly_yy = saly_yy;
		this.saly_no = saly_no;
		this.sfromemail = sfromemail;
		this.smailsubject = smailsubject;
		this.smailcontent = smailcontent;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSaly_yy(String saly_yy){
		this.saly_yy = saly_yy;
	}

	public void setSaly_no(String saly_no){
		this.saly_no = saly_no;
	}

	public void setSfromemail(String sfromemail){
		this.sfromemail = sfromemail;
	}

	public void setSmailsubject(String smailsubject){
		this.smailsubject = smailsubject;
	}

	public void setSmailcontent(String smailcontent){
		this.smailcontent = smailcontent;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSaly_yy(){
		return this.saly_yy;
	}

	public String getSaly_no(){
		return this.saly_no;
	}

	public String getSfromemail(){
		return this.sfromemail;
	}

	public String getSmailsubject(){
		return this.smailsubject;
	}

	public String getSmailcontent(){
		return this.smailcontent;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EMSY_1100_A(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EMSY_1100_ADM dm = (HD_EMSY_1100_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.saly_yy);
		cstmt.setString(5, dm.saly_no);
		cstmt.setString(6, dm.sfromemail);
		cstmt.setString(7, dm.smailsubject);
		cstmt.setString(8, dm.smailcontent);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_EMSY_1100_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("saly_yy = [" + getSaly_yy() + "]");
		System.out.println("saly_no = [" + getSaly_no() + "]");
		System.out.println("sfromemail = [" + getSfromemail() + "]");
		System.out.println("smailsubject = [" + getSmailsubject() + "]");
		System.out.println("smailcontent = [" + getSmailcontent() + "]");
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
String saly_yy = req.getParameter("saly_yy");
if( saly_yy == null){
	System.out.println(this.toString+" : saly_yy is null" );
}else{
	System.out.println(this.toString+" : saly_yy is "+saly_yy );
}
String saly_no = req.getParameter("saly_no");
if( saly_no == null){
	System.out.println(this.toString+" : saly_no is null" );
}else{
	System.out.println(this.toString+" : saly_no is "+saly_no );
}
String sfromemail = req.getParameter("sfromemail");
if( sfromemail == null){
	System.out.println(this.toString+" : sfromemail is null" );
}else{
	System.out.println(this.toString+" : sfromemail is "+sfromemail );
}
String smailsubject = req.getParameter("smailsubject");
if( smailsubject == null){
	System.out.println(this.toString+" : smailsubject is null" );
}else{
	System.out.println(this.toString+" : smailsubject is "+smailsubject );
}
String smailcontent = req.getParameter("smailcontent");
if( smailcontent == null){
	System.out.println(this.toString+" : smailcontent is null" );
}else{
	System.out.println(this.toString+" : smailcontent is "+smailcontent );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String saly_yy = Util.checkString(req.getParameter("saly_yy"));
String saly_no = Util.checkString(req.getParameter("saly_no"));
String sfromemail = Util.checkString(req.getParameter("sfromemail"));
String smailsubject = Util.checkString(req.getParameter("smailsubject"));
String smailcontent = Util.checkString(req.getParameter("smailcontent"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String saly_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_yy")));
String saly_no = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_no")));
String sfromemail = Util.Uni2Ksc(Util.checkString(req.getParameter("sfromemail")));
String smailsubject = Util.Uni2Ksc(Util.checkString(req.getParameter("smailsubject")));
String smailcontent = Util.Uni2Ksc(Util.checkString(req.getParameter("smailcontent")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSaly_yy(saly_yy);
dm.setSaly_no(saly_no);
dm.setSfromemail(sfromemail);
dm.setSmailsubject(smailsubject);
dm.setSmailcontent(smailcontent);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Oct 11 15:32:51 KST 2010 */