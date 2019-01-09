/***************************************************************************************************
* ���ϸ� : .java
* ��� : ��������-����_�ڵ���ü-��ü��û���� ����ȸ 
* �ۼ����� :2009/05/21 
* �ۼ��� : ����
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * ��������-����_�ڵ���ü-��ü��û���� ����ȸ 
 */

public class SS_S_SHFTAPLCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String sysid;
	public String basidt;
	public String svctype;
	public String aplcclsf;

	public SS_S_SHFTAPLCDM(){}
	public SS_S_SHFTAPLCDM(String sysid, String basidt, String svctype, String aplcclsf){
		this.sysid = sysid;
		this.basidt = basidt;
		this.svctype = svctype;
		this.aplcclsf = aplcclsf;
	}

	public void setSysid(String sysid){
		this.sysid = sysid;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setSvctype(String svctype){
		this.svctype = svctype;
	}

	public void setAplcclsf(String aplcclsf){
		this.aplcclsf = aplcclsf;
	}

	public String getSysid(){
		return this.sysid;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getSvctype(){
		return this.svctype;
	}

	public String getAplcclsf(){
		return this.aplcclsf;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_SHFTAPLC( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_SHFTAPLCDM dm = (SS_S_SHFTAPLCDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.sysid);
		cstmt.setString(4, dm.basidt);
		cstmt.setString(5, dm.svctype);
		cstmt.setString(6, dm.aplcclsf);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_S_SHFTAPLCDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String sysid = req.getParameter("sysid");
if( sysid == null){
	System.out.println(this.toString+" : sysid is null" );
}else{
	System.out.println(this.toString+" : sysid is "+sysid );
}
String basidt = req.getParameter("basidt");
if( basidt == null){
	System.out.println(this.toString+" : basidt is null" );
}else{
	System.out.println(this.toString+" : basidt is "+basidt );
}
String svctype = req.getParameter("svctype");
if( svctype == null){
	System.out.println(this.toString+" : svctype is null" );
}else{
	System.out.println(this.toString+" : svctype is "+svctype );
}
String aplcclsf = req.getParameter("aplcclsf");
if( aplcclsf == null){
	System.out.println(this.toString+" : aplcclsf is null" );
}else{
	System.out.println(this.toString+" : aplcclsf is "+aplcclsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String sysid = Util.checkString(req.getParameter("sysid"));
String basidt = Util.checkString(req.getParameter("basidt"));
String svctype = Util.checkString(req.getParameter("svctype"));
String aplcclsf = Util.checkString(req.getParameter("aplcclsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String sysid = Util.Uni2Ksc(Util.checkString(req.getParameter("sysid")));
String basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("basidt")));
String svctype = Util.Uni2Ksc(Util.checkString(req.getParameter("svctype")));
String aplcclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcclsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setSysid(sysid);
dm.setBasidt(basidt);
dm.setSvctype(svctype);
dm.setAplcclsf(aplcclsf);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 21 17:55:54 PDT 2009 */