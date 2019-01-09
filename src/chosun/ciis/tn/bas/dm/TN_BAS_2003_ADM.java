/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.bas.ds.*;
import chosun.ciis.tn.bas.rec.*;

/**
 * 
 */


public class TN_BAS_2003_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String membercategorycode;
	public String parentmembercategorycode;
	public String depth;
	public String mode;

	public TN_BAS_2003_ADM(){}
	public TN_BAS_2003_ADM(String cmpy_cd, String membercategorycode, String parentmembercategorycode, String depth, String mode){
		this.cmpy_cd = cmpy_cd;
		this.membercategorycode = membercategorycode;
		this.parentmembercategorycode = parentmembercategorycode;
		this.depth = depth;
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMembercategorycode(String membercategorycode){
		this.membercategorycode = membercategorycode;
	}

	public void setParentmembercategorycode(String parentmembercategorycode){
		this.parentmembercategorycode = parentmembercategorycode;
	}

	public void setDepth(String depth){
		this.depth = depth;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMembercategorycode(){
		return this.membercategorycode;
	}

	public String getParentmembercategorycode(){
		return this.parentmembercategorycode;
	}

	public String getDepth(){
		return this.depth;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_BAS_2003_A(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_BAS_2003_ADM dm = (TN_BAS_2003_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.membercategorycode);
		cstmt.setString(5, dm.parentmembercategorycode);
		cstmt.setString(6, dm.depth);
		cstmt.setString(7, dm.mode);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.bas.ds.TN_BAS_2003_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("membercategorycode = [" + getMembercategorycode() + "]");
		System.out.println("parentmembercategorycode = [" + getParentmembercategorycode() + "]");
		System.out.println("depth = [" + getDepth() + "]");
		System.out.println("mode = [" + getMode() + "]");
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
String membercategorycode = req.getParameter("membercategorycode");
if( membercategorycode == null){
	System.out.println(this.toString+" : membercategorycode is null" );
}else{
	System.out.println(this.toString+" : membercategorycode is "+membercategorycode );
}
String parentmembercategorycode = req.getParameter("parentmembercategorycode");
if( parentmembercategorycode == null){
	System.out.println(this.toString+" : parentmembercategorycode is null" );
}else{
	System.out.println(this.toString+" : parentmembercategorycode is "+parentmembercategorycode );
}
String depth = req.getParameter("depth");
if( depth == null){
	System.out.println(this.toString+" : depth is null" );
}else{
	System.out.println(this.toString+" : depth is "+depth );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String membercategorycode = Util.checkString(req.getParameter("membercategorycode"));
String parentmembercategorycode = Util.checkString(req.getParameter("parentmembercategorycode"));
String depth = Util.checkString(req.getParameter("depth"));
String mode = Util.checkString(req.getParameter("mode"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String membercategorycode = Util.Uni2Ksc(Util.checkString(req.getParameter("membercategorycode")));
String parentmembercategorycode = Util.Uni2Ksc(Util.checkString(req.getParameter("parentmembercategorycode")));
String depth = Util.Uni2Ksc(Util.checkString(req.getParameter("depth")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMembercategorycode(membercategorycode);
dm.setParentmembercategorycode(parentmembercategorycode);
dm.setDepth(depth);
dm.setMode(mode);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 08 18:09:15 KST 2016 */