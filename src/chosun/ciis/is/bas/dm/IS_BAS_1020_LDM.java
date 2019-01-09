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


package chosun.ciis.is.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bas.ds.*;
import chosun.ciis.is.bas.rec.*;

/**
 * 
 */


public class IS_BAS_1020_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String std_cd;
	public String seq;

	public IS_BAS_1020_LDM(){}
	public IS_BAS_1020_LDM(String cmpy_cd, String std_cd, String seq){
		this.cmpy_cd = cmpy_cd;
		this.std_cd = std_cd;
		this.seq = seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setStd_cd(String std_cd){
		this.std_cd = std_cd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getStd_cd(){
		return this.std_cd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_BAS_1020_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_BAS_1020_LDM dm = (IS_BAS_1020_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.std_cd);
		cstmt.setString(5, dm.seq);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.bas.ds.IS_BAS_1020_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("std_cd = [" + getStd_cd() + "]");
		System.out.println("seq = [" + getSeq() + "]");
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
String std_cd = req.getParameter("std_cd");
if( std_cd == null){
	System.out.println(this.toString+" : std_cd is null" );
}else{
	System.out.println(this.toString+" : std_cd is "+std_cd );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String std_cd = Util.checkString(req.getParameter("std_cd"));
String seq = Util.checkString(req.getParameter("seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String std_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("std_cd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setStd_cd(std_cd);
dm.setSeq(seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 17 20:47:08 KST 2012 */