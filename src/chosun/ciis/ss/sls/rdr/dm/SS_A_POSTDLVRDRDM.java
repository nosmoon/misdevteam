/***************************************************************************************************
* 파일명 : SS_A_POSTDLVRDRDM.java
* 기능 : 독자관리 우송독자관리 저장
* 작성일자 : 2015-06-26
* 작성자 : 장선희 
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 
 */


public class SS_A_POSTDLVRDRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_no;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String newdlvzip;
	public String newdlvaddr;
	public String newdlvdtlsaddr;
	public String bldmngnn;

	public SS_A_POSTDLVRDRDM(){}
	public SS_A_POSTDLVRDRDM(String rdr_no, String dlvaddr, String dlvdtlsaddr, String newdlvzip, String newdlvaddr, String newdlvdtlsaddr, String bldmngnn){
		this.rdr_no = rdr_no;
		this.dlvaddr = dlvaddr;
		this.dlvdtlsaddr = dlvdtlsaddr;
		this.newdlvzip = newdlvzip;
		this.newdlvaddr = newdlvaddr;
		this.newdlvdtlsaddr = newdlvdtlsaddr;
		this.bldmngnn = bldmngnn;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvdtlsaddr(String dlvdtlsaddr){
		this.dlvdtlsaddr = dlvdtlsaddr;
	}

	public void setNewdlvzip(String newdlvzip){
		this.newdlvzip = newdlvzip;
	}

	public void setNewdlvaddr(String newdlvaddr){
		this.newdlvaddr = newdlvaddr;
	}

	public void setNewdlvdtlsaddr(String newdlvdtlsaddr){
		this.newdlvdtlsaddr = newdlvdtlsaddr;
	}

	public void setBldmngnn(String bldmngnn){
		this.bldmngnn = bldmngnn;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvdtlsaddr(){
		return this.dlvdtlsaddr;
	}

	public String getNewdlvzip(){
		return this.newdlvzip;
	}

	public String getNewdlvaddr(){
		return this.newdlvaddr;
	}

	public String getNewdlvdtlsaddr(){
		return this.newdlvdtlsaddr;
	}

	public String getBldmngnn(){
		return this.bldmngnn;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_POSTDLVRDR( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_POSTDLVRDRDM dm = (SS_A_POSTDLVRDRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_no);
		cstmt.setString(4, dm.dlvaddr);
		cstmt.setString(5, dm.dlvdtlsaddr);
		cstmt.setString(6, dm.newdlvzip);
		cstmt.setString(7, dm.newdlvaddr);
		cstmt.setString(8, dm.newdlvdtlsaddr);
		cstmt.setString(9, dm.bldmngnn);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.rdr.ds.SS_A_POSTDLVRDRDataSet();
	}



    public void print(){
        System.out.println("rdr_no = " + getRdr_no());
        System.out.println("dlvaddr = " + getDlvaddr());
        System.out.println("dlvdtlsaddr = " + getDlvdtlsaddr());
        System.out.println("newdlvzip = " + getNewdlvzip());
        System.out.println("newdlvaddr = " + getNewdlvaddr());
        System.out.println("newdlvdtlsaddr = " + getNewdlvdtlsaddr());
        System.out.println("bldmngnn = " + getBldmngnn());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String dlvaddr = req.getParameter("dlvaddr");
if( dlvaddr == null){
	System.out.println(this.toString+" : dlvaddr is null" );
}else{
	System.out.println(this.toString+" : dlvaddr is "+dlvaddr );
}
String dlvdtlsaddr = req.getParameter("dlvdtlsaddr");
if( dlvdtlsaddr == null){
	System.out.println(this.toString+" : dlvdtlsaddr is null" );
}else{
	System.out.println(this.toString+" : dlvdtlsaddr is "+dlvdtlsaddr );
}
String newdlvzip = req.getParameter("newdlvzip");
if( newdlvzip == null){
	System.out.println(this.toString+" : newdlvzip is null" );
}else{
	System.out.println(this.toString+" : newdlvzip is "+newdlvzip );
}
String newdlvaddr = req.getParameter("newdlvaddr");
if( newdlvaddr == null){
	System.out.println(this.toString+" : newdlvaddr is null" );
}else{
	System.out.println(this.toString+" : newdlvaddr is "+newdlvaddr );
}
String newdlvdtlsaddr = req.getParameter("newdlvdtlsaddr");
if( newdlvdtlsaddr == null){
	System.out.println(this.toString+" : newdlvdtlsaddr is null" );
}else{
	System.out.println(this.toString+" : newdlvdtlsaddr is "+newdlvdtlsaddr );
}
String bldmngnn = req.getParameter("bldmngnn");
if( bldmngnn == null){
	System.out.println(this.toString+" : bldmngnn is null" );
}else{
	System.out.println(this.toString+" : bldmngnn is "+bldmngnn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String dlvaddr = Util.checkString(req.getParameter("dlvaddr"));
String dlvdtlsaddr = Util.checkString(req.getParameter("dlvdtlsaddr"));
String newdlvzip = Util.checkString(req.getParameter("newdlvzip"));
String newdlvaddr = Util.checkString(req.getParameter("newdlvaddr"));
String newdlvdtlsaddr = Util.checkString(req.getParameter("newdlvdtlsaddr"));
String bldmngnn = Util.checkString(req.getParameter("bldmngnn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));
String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));
String newdlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("newdlvzip")));
String newdlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("newdlvaddr")));
String newdlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("newdlvdtlsaddr")));
String bldmngnn = Util.Uni2Ksc(Util.checkString(req.getParameter("bldmngnn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setRdr_no(rdr_no);
dm.setDlvaddr(dlvaddr);
dm.setDlvdtlsaddr(dlvdtlsaddr);
dm.setNewdlvzip(newdlvzip);
dm.setNewdlvaddr(newdlvaddr);
dm.setNewdlvdtlsaddr(newdlvdtlsaddr);
dm.setBldmngnn(bldmngnn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 26 10:08:14 KST 2015 */