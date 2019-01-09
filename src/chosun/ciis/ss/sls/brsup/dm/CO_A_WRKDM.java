/***************************************************************************************************
* 파일명 : .java
* 기능 : 지국지원-빌링-파일업로드-EDI
* 작성일자 : 2008-05-26
* 작성자 : 노상현
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 *지국지원-빌링-파일업로드 */

public class CO_A_WRKDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String id;
	public String execno;
	public Timestamp workfrdt;
	public Timestamp worktodt;
	public String execocomcd;
	public String workremk1;
	public String workremk2;
	public String work_pers;

	public CO_A_WRKDM(){}
	public CO_A_WRKDM(String accflag, String id, String execno, Timestamp workfrdt, Timestamp worktodt, String execocomcd, String workremk1, String workremk2, String work_pers){
		this.accflag = accflag;
		this.id = id;
		this.execno = execno;
		this.workfrdt = workfrdt;
		this.worktodt = worktodt;
		this.execocomcd = execocomcd;
		this.workremk1 = workremk1;
		this.workremk2 = workremk2;
		this.work_pers = work_pers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setId(String id){
		this.id = id;
	}

	public void setExecno(String execno){
		this.execno = execno;
	}

	public void setWorkfrdt(Timestamp workfrdt){
		this.workfrdt = workfrdt;
	}

	public void setWorktodt(Timestamp worktodt){
		this.worktodt = worktodt;
	}

	public void setExecocomcd(String execocomcd){
		this.execocomcd = execocomcd;
	}

	public void setWorkremk1(String workremk1){
		this.workremk1 = workremk1;
	}

	public void setWorkremk2(String workremk2){
		this.workremk2 = workremk2;
	}

	public void setWork_pers(String work_pers){
		this.work_pers = work_pers;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getId(){
		return this.id;
	}

	public String getExecno(){
		return this.execno;
	}

	public Timestamp getWorkfrdt(){
		return this.workfrdt;
	}

	public Timestamp getWorktodt(){
		return this.worktodt;
	}

	public String getExecocomcd(){
		return this.execocomcd;
	}

	public String getWorkremk1(){
		return this.workremk1;
	}

	public String getWorkremk2(){
		return this.workremk2;
	}

	public String getWork_pers(){
		return this.work_pers;
	}

	public String getSQL(){
		 return "{ call SP_CO_A_WRK( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_A_WRKDM dm = (CO_A_WRKDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.id);
		cstmt.setString(5, dm.execno);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.setTimestamp(6, dm.workfrdt);
		cstmt.setTimestamp(7, dm.worktodt);
		cstmt.setString(8, dm.execocomcd);
		cstmt.setString(9, dm.workremk1);
		cstmt.setString(10, dm.workremk2);
		cstmt.setString(11, dm.work_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.CO_A_WRKDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String id = req.getParameter("id");
if( id == null){
	System.out.println(this.toString+" : id is null" );
}else{
	System.out.println(this.toString+" : id is "+id );
}
String execno = req.getParameter("execno");
if( execno == null){
	System.out.println(this.toString+" : execno is null" );
}else{
	System.out.println(this.toString+" : execno is "+execno );
}
String workfrdt = req.getParameter("workfrdt");
if( workfrdt == null){
	System.out.println(this.toString+" : workfrdt is null" );
}else{
	System.out.println(this.toString+" : workfrdt is "+workfrdt );
}
String worktodt = req.getParameter("worktodt");
if( worktodt == null){
	System.out.println(this.toString+" : worktodt is null" );
}else{
	System.out.println(this.toString+" : worktodt is "+worktodt );
}
String execocomcd = req.getParameter("execocomcd");
if( execocomcd == null){
	System.out.println(this.toString+" : execocomcd is null" );
}else{
	System.out.println(this.toString+" : execocomcd is "+execocomcd );
}
String workremk1 = req.getParameter("workremk1");
if( workremk1 == null){
	System.out.println(this.toString+" : workremk1 is null" );
}else{
	System.out.println(this.toString+" : workremk1 is "+workremk1 );
}
String workremk2 = req.getParameter("workremk2");
if( workremk2 == null){
	System.out.println(this.toString+" : workremk2 is null" );
}else{
	System.out.println(this.toString+" : workremk2 is "+workremk2 );
}
String work_pers = req.getParameter("work_pers");
if( work_pers == null){
	System.out.println(this.toString+" : work_pers is null" );
}else{
	System.out.println(this.toString+" : work_pers is "+work_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String accflag = Util.checkString(req.getParameter("accflag"));
String id = Util.checkString(req.getParameter("id"));
String execno = Util.checkString(req.getParameter("execno"));
String workfrdt = Util.checkString(req.getParameter("workfrdt"));
String worktodt = Util.checkString(req.getParameter("worktodt"));
String execocomcd = Util.checkString(req.getParameter("execocomcd"));
String workremk1 = Util.checkString(req.getParameter("workremk1"));
String workremk2 = Util.checkString(req.getParameter("workremk2"));
String work_pers = Util.checkString(req.getParameter("work_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String id = Util.Uni2Ksc(Util.checkString(req.getParameter("id")));
String execno = Util.Uni2Ksc(Util.checkString(req.getParameter("execno")));
String workfrdt = Util.Uni2Ksc(Util.checkString(req.getParameter("workfrdt")));
String worktodt = Util.Uni2Ksc(Util.checkString(req.getParameter("worktodt")));
String execocomcd = Util.Uni2Ksc(Util.checkString(req.getParameter("execocomcd")));
String workremk1 = Util.Uni2Ksc(Util.checkString(req.getParameter("workremk1")));
String workremk2 = Util.Uni2Ksc(Util.checkString(req.getParameter("workremk2")));
String work_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("work_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setId(id);
dm.setExecno(execno);
dm.setWorkfrdt(workfrdt);
dm.setWorktodt(worktodt);
dm.setExecocomcd(execocomcd);
dm.setWorkremk1(workremk1);
dm.setWorkremk2(workremk2);
dm.setWork_pers(work_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 26 17:01:44 KST 2008 */