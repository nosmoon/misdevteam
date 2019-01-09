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


package chosun.ciis.mc.co.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.co.ds.*;
import chosun.ciis.mc.co.rec.*;

/**
 * 
 */


public class MC_CO_1004_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String cd;
	public String cdnm;
	public String from_cd;
	public String to_cd;
	public String query;

	public MC_CO_1004_LDM(){}
	public MC_CO_1004_LDM(String cmpy_cd, String cd, String cdnm, String from_cd, String to_cd, String query){
		this.cmpy_cd = cmpy_cd;
		this.cd = cd;
		this.cdnm = cdnm;
		this.from_cd = from_cd;
		this.to_cd = to_cd;
		this.query = query;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setFrom_cd(String from_cd){
		this.from_cd = from_cd;
	}

	public void setTo_cd(String to_cd){
		this.to_cd = to_cd;
	}

	public void setQuery(String query){
		this.query = query;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getFrom_cd(){
		return this.from_cd;
	}

	public String getTo_cd(){
		return this.to_cd;
	}

	public String getQuery(){
		return this.query;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_CO_1004_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_CO_1004_LDM dm = (MC_CO_1004_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.cd);
		cstmt.setString(5, dm.cdnm);
		cstmt.setString(6, dm.from_cd);
		cstmt.setString(7, dm.to_cd);
		cstmt.setString(8, dm.query);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.co.ds.MC_CO_1004_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("cd = " + getCd());
        System.out.println("cdnm = " + getCdnm());
        System.out.println("from_cd = " + getFrom_cd());
        System.out.println("to_cd = " + getTo_cd());
        System.out.println("query = " + getQuery());
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
String cd = req.getParameter("cd");
if( cd == null){
	System.out.println(this.toString+" : cd is null" );
}else{
	System.out.println(this.toString+" : cd is "+cd );
}
String cdnm = req.getParameter("cdnm");
if( cdnm == null){
	System.out.println(this.toString+" : cdnm is null" );
}else{
	System.out.println(this.toString+" : cdnm is "+cdnm );
}
String from_cd = req.getParameter("from_cd");
if( from_cd == null){
	System.out.println(this.toString+" : from_cd is null" );
}else{
	System.out.println(this.toString+" : from_cd is "+from_cd );
}
String to_cd = req.getParameter("to_cd");
if( to_cd == null){
	System.out.println(this.toString+" : to_cd is null" );
}else{
	System.out.println(this.toString+" : to_cd is "+to_cd );
}
String query = req.getParameter("query");
if( query == null){
	System.out.println(this.toString+" : query is null" );
}else{
	System.out.println(this.toString+" : query is "+query );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String cd = Util.checkString(req.getParameter("cd"));
String cdnm = Util.checkString(req.getParameter("cdnm"));
String from_cd = Util.checkString(req.getParameter("from_cd"));
String to_cd = Util.checkString(req.getParameter("to_cd"));
String query = Util.checkString(req.getParameter("query"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cd")));
String cdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cdnm")));
String from_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("from_cd")));
String to_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("to_cd")));
String query = Util.Uni2Ksc(Util.checkString(req.getParameter("query")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCd(cd);
dm.setCdnm(cdnm);
dm.setFrom_cd(from_cd);
dm.setTo_cd(to_cd);
dm.setQuery(query);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 09 11:21:23 KST 2009 */