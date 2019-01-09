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


package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 
 */


public class SS_A_SQL_EXECUTE_WRKDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String program_id;
	public String sql_nm;
	public String sql_dt;
	public String sql_seq;
	public String sql_text;
	public String dml_flag;
	public String db_nm;
	public String erryn;
	public String errmsg;
	public String incmgpers;
	public String ipaddr;

	public SS_A_SQL_EXECUTE_WRKDM(){}
	public SS_A_SQL_EXECUTE_WRKDM(String accflag, String program_id, String sql_nm, String sql_dt, String sql_seq, String sql_text, String dml_flag, String db_nm, String erryn, String errmsg, String incmgpers, String ipaddr){
		this.accflag = accflag;
		this.program_id = program_id;
		this.sql_nm = sql_nm;
		this.sql_dt = sql_dt;
		this.sql_seq = sql_seq;
		this.sql_text = sql_text;
		this.dml_flag = dml_flag;
		this.db_nm = db_nm;
		this.erryn = erryn;
		this.errmsg = errmsg;
		this.incmgpers = incmgpers;
		this.ipaddr = ipaddr;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setProgram_id(String program_id){
		this.program_id = program_id;
	}

	public void setSql_nm(String sql_nm){
		this.sql_nm = sql_nm;
	}

	public void setSql_dt(String sql_dt){
		this.sql_dt = sql_dt;
	}

	public void setSql_seq(String sql_seq){
		this.sql_seq = sql_seq;
	}

	public void setSql_text(String sql_text){
		this.sql_text = sql_text;
	}

	public void setDml_flag(String dml_flag){
		this.dml_flag = dml_flag;
	}

	public void setDb_nm(String db_nm){
		this.db_nm = db_nm;
	}

	public void setErryn(String erryn){
		this.erryn = erryn;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setIpaddr(String ipaddr){
		this.ipaddr = ipaddr;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getProgram_id(){
		return this.program_id;
	}

	public String getSql_nm(){
		return this.sql_nm;
	}

	public String getSql_dt(){
		return this.sql_dt;
	}

	public String getSql_seq(){
		return this.sql_seq;
	}

	public String getSql_text(){
		return this.sql_text;
	}

	public String getDml_flag(){
		return this.dml_flag;
	}

	public String getDb_nm(){
		return this.db_nm;
	}

	public String getErryn(){
		return this.erryn;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getIpaddr(){
		return this.ipaddr;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_SQL_EXECUTE_WRK(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_SQL_EXECUTE_WRKDM dm = (SS_A_SQL_EXECUTE_WRKDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.program_id);
		cstmt.setString(5, dm.sql_nm);
		cstmt.setString(6, dm.sql_dt);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.setString(7, dm.sql_seq);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.setString(8, dm.sql_text);
		cstmt.setString(9, dm.dml_flag);
		cstmt.setString(10, dm.db_nm);
		cstmt.setString(11, dm.erryn);
		cstmt.setString(12, dm.errmsg);
		cstmt.setString(13, dm.incmgpers);
		cstmt.setString(14, dm.ipaddr);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_A_SQL_EXECUTE_WRKDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("accflag = [" + getAccflag() + "]");
		System.out.println("program_id = [" + getProgram_id() + "]");
		System.out.println("sql_nm = [" + getSql_nm() + "]");
		System.out.println("sql_dt = [" + getSql_dt() + "]");
		System.out.println("sql_seq = [" + getSql_seq() + "]");
		System.out.println("sql_text = [" + getSql_text() + "]");
		System.out.println("dml_flag = [" + getDml_flag() + "]");
		System.out.println("db_nm = [" + getDb_nm() + "]");
		System.out.println("erryn = [" + getErryn() + "]");
		System.out.println("errmsg = [" + getErrmsg() + "]");
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("ipaddr = [" + getIpaddr() + "]");
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
String program_id = req.getParameter("program_id");
if( program_id == null){
	System.out.println(this.toString+" : program_id is null" );
}else{
	System.out.println(this.toString+" : program_id is "+program_id );
}
String sql_nm = req.getParameter("sql_nm");
if( sql_nm == null){
	System.out.println(this.toString+" : sql_nm is null" );
}else{
	System.out.println(this.toString+" : sql_nm is "+sql_nm );
}
String sql_dt = req.getParameter("sql_dt");
if( sql_dt == null){
	System.out.println(this.toString+" : sql_dt is null" );
}else{
	System.out.println(this.toString+" : sql_dt is "+sql_dt );
}
String sql_seq = req.getParameter("sql_seq");
if( sql_seq == null){
	System.out.println(this.toString+" : sql_seq is null" );
}else{
	System.out.println(this.toString+" : sql_seq is "+sql_seq );
}
String sql_text = req.getParameter("sql_text");
if( sql_text == null){
	System.out.println(this.toString+" : sql_text is null" );
}else{
	System.out.println(this.toString+" : sql_text is "+sql_text );
}
String dml_flag = req.getParameter("dml_flag");
if( dml_flag == null){
	System.out.println(this.toString+" : dml_flag is null" );
}else{
	System.out.println(this.toString+" : dml_flag is "+dml_flag );
}
String db_nm = req.getParameter("db_nm");
if( db_nm == null){
	System.out.println(this.toString+" : db_nm is null" );
}else{
	System.out.println(this.toString+" : db_nm is "+db_nm );
}
String erryn = req.getParameter("erryn");
if( erryn == null){
	System.out.println(this.toString+" : erryn is null" );
}else{
	System.out.println(this.toString+" : erryn is "+erryn );
}
String errmsg = req.getParameter("errmsg");
if( errmsg == null){
	System.out.println(this.toString+" : errmsg is null" );
}else{
	System.out.println(this.toString+" : errmsg is "+errmsg );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String ipaddr = req.getParameter("ipaddr");
if( ipaddr == null){
	System.out.println(this.toString+" : ipaddr is null" );
}else{
	System.out.println(this.toString+" : ipaddr is "+ipaddr );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String accflag = Util.checkString(req.getParameter("accflag"));
String program_id = Util.checkString(req.getParameter("program_id"));
String sql_nm = Util.checkString(req.getParameter("sql_nm"));
String sql_dt = Util.checkString(req.getParameter("sql_dt"));
String sql_seq = Util.checkString(req.getParameter("sql_seq"));
String sql_text = Util.checkString(req.getParameter("sql_text"));
String dml_flag = Util.checkString(req.getParameter("dml_flag"));
String db_nm = Util.checkString(req.getParameter("db_nm"));
String erryn = Util.checkString(req.getParameter("erryn"));
String errmsg = Util.checkString(req.getParameter("errmsg"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String ipaddr = Util.checkString(req.getParameter("ipaddr"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String program_id = Util.Uni2Ksc(Util.checkString(req.getParameter("program_id")));
String sql_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("sql_nm")));
String sql_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("sql_dt")));
String sql_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sql_seq")));
String sql_text = Util.Uni2Ksc(Util.checkString(req.getParameter("sql_text")));
String dml_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("dml_flag")));
String db_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("db_nm")));
String erryn = Util.Uni2Ksc(Util.checkString(req.getParameter("erryn")));
String errmsg = Util.Uni2Ksc(Util.checkString(req.getParameter("errmsg")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("ipaddr")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setProgram_id(program_id);
dm.setSql_nm(sql_nm);
dm.setSql_dt(sql_dt);
dm.setSql_seq(sql_seq);
dm.setSql_text(sql_text);
dm.setDml_flag(dml_flag);
dm.setDb_nm(db_nm);
dm.setErryn(erryn);
dm.setErrmsg(errmsg);
dm.setIncmgpers(incmgpers);
dm.setIpaddr(ipaddr);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 24 02:17:57 GMT 2013 */