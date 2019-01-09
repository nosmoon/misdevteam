/***************************************************************************************************
* 파일명 : SE_BAS_1310_LDM.java
* 기능 : 기준정보관리
* 작성일자 : 2009-03-11
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bas.ds.*;
import chosun.ciis.se.bas.rec.*;

/**
 * 
 */


public class SE_BAS_1310_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String gb;
	public String aply_yymm;

	public SE_BAS_1310_LDM(){}
	public SE_BAS_1310_LDM(String cmpy_cd, String gb, String aply_yymm){
		this.cmpy_cd = cmpy_cd;
		this.gb = gb;
		this.aply_yymm = aply_yymm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setGb(String gb){
		this.gb = gb;
	}

	public void setAply_yymm(String aply_yymm){
		this.aply_yymm = aply_yymm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getGb(){
		return this.gb;
	}

	public String getAply_yymm(){
		return this.aply_yymm;
	}

	public String getSQL(){
		 return "{ call SP_SE_BAS_1310_L( ?, ?, ?, ?, ?, ?, ?) }";
	}
	
	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BAS_1310_LDM dm = (SE_BAS_1310_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.gb);
		cstmt.setString(5, dm.aply_yymm);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.bas.ds.SE_BAS_1310_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("gb = " + getGb());
        System.out.println("aply_yymm = " + getAply_yymm());
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
String gb = req.getParameter("gb");
if( gb == null){
	System.out.println(this.toString+" : gb is null" );
}else{
	System.out.println(this.toString+" : gb is "+gb );
}
String aply_yymm = req.getParameter("aply_yymm");
if( aply_yymm == null){
	System.out.println(this.toString+" : aply_yymm is null" );
}else{
	System.out.println(this.toString+" : aply_yymm is "+aply_yymm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String gb = Util.checkString(req.getParameter("gb"));
String aply_yymm = Util.checkString(req.getParameter("aply_yymm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String gb = Util.Uni2Ksc(Util.checkString(req.getParameter("gb")));
String aply_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_yymm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setGb(gb);
dm.setAply_yymm(aply_yymm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 24 10:13:32 KST 2009 */