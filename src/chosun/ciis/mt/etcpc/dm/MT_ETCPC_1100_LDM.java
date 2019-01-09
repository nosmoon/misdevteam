/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.mt.etcpc.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcpc.ds.*;
import chosun.ciis.mt.etcpc.rec.*;

/**
 * 
 */


public class MT_ETCPC_1100_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String modl_kind;
	public String modl_mang_no;
	public String modl_nm;

	public MT_ETCPC_1100_LDM(){}
	public MT_ETCPC_1100_LDM(String cmpy_cd, String modl_kind, String modl_mang_no, String modl_nm){
		this.cmpy_cd = cmpy_cd;
		this.modl_kind = modl_kind;
		this.modl_mang_no = modl_mang_no;
		this.modl_nm = modl_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setModl_kind(String modl_kind){
		this.modl_kind = modl_kind;
	}

	public void setModl_mang_no(String modl_mang_no){
		this.modl_mang_no = modl_mang_no;
	}

	public void setModl_nm(String modl_nm){
		this.modl_nm = modl_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getModl_kind(){
		return this.modl_kind;
	}

	public String getModl_mang_no(){
		return this.modl_mang_no;
	}

	public String getModl_nm(){
		return this.modl_nm;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCPC_1100_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCPC_1100_LDM dm = (MT_ETCPC_1100_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.modl_kind);
		cstmt.setString(5, dm.modl_mang_no);
		cstmt.setString(6, dm.modl_nm);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etcpc.ds.MT_ETCPC_1100_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("modl_kind = " + getModl_kind());
        System.out.println("modl_mang_no = " + getModl_mang_no());
        System.out.println("modl_nm = " + getModl_nm());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String modl_kind = req.getParameter("modl_kind");
if( modl_kind == null){
	System.out.println(this.toString+" : modl_kind is null" );
}else{
	System.out.println(this.toString+" : modl_kind is "+modl_kind );
}
String modl_mang_no = req.getParameter("modl_mang_no");
if( modl_mang_no == null){
	System.out.println(this.toString+" : modl_mang_no is null" );
}else{
	System.out.println(this.toString+" : modl_mang_no is "+modl_mang_no );
}
String modl_nm = req.getParameter("modl_nm");
if( modl_nm == null){
	System.out.println(this.toString+" : modl_nm is null" );
}else{
	System.out.println(this.toString+" : modl_nm is "+modl_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String modl_kind = Util.checkString(req.getParameter("modl_kind"));
String modl_mang_no = Util.checkString(req.getParameter("modl_mang_no"));
String modl_nm = Util.checkString(req.getParameter("modl_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String modl_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("modl_kind")));
String modl_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("modl_mang_no")));
String modl_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("modl_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setModl_kind(modl_kind);
dm.setModl_mang_no(modl_mang_no);
dm.setModl_nm(modl_nm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Mar 12 08:55:48 KST 2009 */