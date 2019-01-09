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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_2001_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String seci_clsf_cd;
	public String seci_no;

	public FC_FUNC_2001_LDM(){}
	public FC_FUNC_2001_LDM(String cmpy_cd, String seci_clsf_cd, String seci_no){
		this.cmpy_cd = cmpy_cd;
		this.seci_clsf_cd = seci_clsf_cd;
		this.seci_no = seci_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSeci_clsf_cd(String seci_clsf_cd){
		this.seci_clsf_cd = seci_clsf_cd;
	}

	public void setSeci_no(String seci_no){
		this.seci_no = seci_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSeci_clsf_cd(){
		return this.seci_clsf_cd;
	}

	public String getSeci_no(){
		return this.seci_no;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_2001_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_2001_LDM dm = (FC_FUNC_2001_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.seci_clsf_cd);
		cstmt.setString(5, dm.seci_no);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_2001_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("seci_clsf_cd = " + getSeci_clsf_cd());
        System.out.println("seci_no = " + getSeci_no());
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
String seci_clsf_cd = req.getParameter("seci_clsf_cd");
if( seci_clsf_cd == null){
	System.out.println(this.toString+" : seci_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : seci_clsf_cd is "+seci_clsf_cd );
}
String seci_no = req.getParameter("seci_no");
if( seci_no == null){
	System.out.println(this.toString+" : seci_no is null" );
}else{
	System.out.println(this.toString+" : seci_no is "+seci_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String seci_clsf_cd = Util.checkString(req.getParameter("seci_clsf_cd"));
String seci_no = Util.checkString(req.getParameter("seci_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String seci_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("seci_clsf_cd")));
String seci_no = Util.Uni2Ksc(Util.checkString(req.getParameter("seci_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setSeci_clsf_cd(seci_clsf_cd);
dm.setSeci_no(seci_no);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 10 14:43:28 KST 2009 */