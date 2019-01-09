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


public class TN_BAS_2004_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String membercategorycode;
	public String parentmembercategorycode;
	public String membertype;
	public String depth;
	public String membercategory;
	public String displayorder;
	public String description;

	public TN_BAS_2004_ADM(){}
	public TN_BAS_2004_ADM(String cmpy_cd, String membercategorycode, String parentmembercategorycode, String membertype, String depth, String membercategory, String displayorder, String description){
		this.cmpy_cd = cmpy_cd;
		this.membercategorycode = membercategorycode;
		this.parentmembercategorycode = parentmembercategorycode;
		this.membertype = membertype;
		this.depth = depth;
		this.membercategory = membercategory;
		this.displayorder = displayorder;
		this.description = description;
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

	public void setMembertype(String membertype){
		this.membertype = membertype;
	}

	public void setDepth(String depth){
		this.depth = depth;
	}

	public void setMembercategory(String membercategory){
		this.membercategory = membercategory;
	}

	public void setDisplayorder(String displayorder){
		this.displayorder = displayorder;
	}

	public void setDescription(String description){
		this.description = description;
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

	public String getMembertype(){
		return this.membertype;
	}

	public String getDepth(){
		return this.depth;
	}

	public String getMembercategory(){
		return this.membercategory;
	}

	public String getDisplayorder(){
		return this.displayorder;
	}

	public String getDescription(){
		return this.description;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_BAS_2004_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_BAS_2004_ADM dm = (TN_BAS_2004_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.membercategorycode);
		cstmt.setString(5, dm.parentmembercategorycode);
		cstmt.setString(6, dm.membertype);
		cstmt.setString(7, dm.depth);
		cstmt.setString(8, dm.membercategory);
		cstmt.setString(9, dm.displayorder);
		cstmt.setString(10, dm.description);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.bas.ds.TN_BAS_2004_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("membercategorycode = [" + getMembercategorycode() + "]");
		System.out.println("parentmembercategorycode = [" + getParentmembercategorycode() + "]");
		System.out.println("membertype = [" + getMembertype() + "]");
		System.out.println("depth = [" + getDepth() + "]");
		System.out.println("membercategory = [" + getMembercategory() + "]");
		System.out.println("displayorder = [" + getDisplayorder() + "]");
		System.out.println("description = [" + getDescription() + "]");
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
String membertype = req.getParameter("membertype");
if( membertype == null){
	System.out.println(this.toString+" : membertype is null" );
}else{
	System.out.println(this.toString+" : membertype is "+membertype );
}
String depth = req.getParameter("depth");
if( depth == null){
	System.out.println(this.toString+" : depth is null" );
}else{
	System.out.println(this.toString+" : depth is "+depth );
}
String membercategory = req.getParameter("membercategory");
if( membercategory == null){
	System.out.println(this.toString+" : membercategory is null" );
}else{
	System.out.println(this.toString+" : membercategory is "+membercategory );
}
String displayorder = req.getParameter("displayorder");
if( displayorder == null){
	System.out.println(this.toString+" : displayorder is null" );
}else{
	System.out.println(this.toString+" : displayorder is "+displayorder );
}
String description = req.getParameter("description");
if( description == null){
	System.out.println(this.toString+" : description is null" );
}else{
	System.out.println(this.toString+" : description is "+description );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String membercategorycode = Util.checkString(req.getParameter("membercategorycode"));
String parentmembercategorycode = Util.checkString(req.getParameter("parentmembercategorycode"));
String membertype = Util.checkString(req.getParameter("membertype"));
String depth = Util.checkString(req.getParameter("depth"));
String membercategory = Util.checkString(req.getParameter("membercategory"));
String displayorder = Util.checkString(req.getParameter("displayorder"));
String description = Util.checkString(req.getParameter("description"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String membercategorycode = Util.Uni2Ksc(Util.checkString(req.getParameter("membercategorycode")));
String parentmembercategorycode = Util.Uni2Ksc(Util.checkString(req.getParameter("parentmembercategorycode")));
String membertype = Util.Uni2Ksc(Util.checkString(req.getParameter("membertype")));
String depth = Util.Uni2Ksc(Util.checkString(req.getParameter("depth")));
String membercategory = Util.Uni2Ksc(Util.checkString(req.getParameter("membercategory")));
String displayorder = Util.Uni2Ksc(Util.checkString(req.getParameter("displayorder")));
String description = Util.Uni2Ksc(Util.checkString(req.getParameter("description")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMembercategorycode(membercategorycode);
dm.setParentmembercategorycode(parentmembercategorycode);
dm.setMembertype(membertype);
dm.setDepth(depth);
dm.setMembercategory(membercategory);
dm.setDisplayorder(displayorder);
dm.setDescription(description);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 07 14:35:32 KST 2016 */