
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


package chosun.ciis.hd.prz.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.prz.ds.*;
import chosun.ciis.hd.prz.rec.*;

/**
 * 
 */


public class HD_PRZ_1400_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String req_dt_fm;
	public String req_dt_to;

	public HD_PRZ_1400_LDM(){}
	public HD_PRZ_1400_LDM(String cmpy_cd, String req_dt_fm, String req_dt_to){
		this.cmpy_cd = cmpy_cd;
		this.req_dt_fm = req_dt_fm;
		this.req_dt_to = req_dt_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setReq_dt_fm(String req_dt_fm){
		this.req_dt_fm = req_dt_fm;
	}

	public void setReq_dt_to(String req_dt_to){
		this.req_dt_to = req_dt_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getReq_dt_fm(){
		return this.req_dt_fm;
	}

	public String getReq_dt_to(){
		return this.req_dt_to;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_PRZ_1400_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_PRZ_1400_LDM dm = (HD_PRZ_1400_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.req_dt_fm);
		cstmt.setString(5, dm.req_dt_to);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.prz.ds.HD_PRZ_1400_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("req_dt_fm = [" + getReq_dt_fm() + "]");
		System.out.println("req_dt_to = [" + getReq_dt_to() + "]");
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
String req_dt_fm = req.getParameter("req_dt_fm");
if( req_dt_fm == null){
	System.out.println(this.toString+" : req_dt_fm is null" );
}else{
	System.out.println(this.toString+" : req_dt_fm is "+req_dt_fm );
}
String req_dt_to = req.getParameter("req_dt_to");
if( req_dt_to == null){
	System.out.println(this.toString+" : req_dt_to is null" );
}else{
	System.out.println(this.toString+" : req_dt_to is "+req_dt_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String req_dt_fm = Util.checkString(req.getParameter("req_dt_fm"));
String req_dt_to = Util.checkString(req.getParameter("req_dt_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String req_dt_fm = Util.Uni2Ksc(Util.checkString(req.getParameter("req_dt_fm")));
String req_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("req_dt_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setReq_dt_fm(req_dt_fm);
dm.setReq_dt_to(req_dt_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 27 11:27:48 KST 2009 */