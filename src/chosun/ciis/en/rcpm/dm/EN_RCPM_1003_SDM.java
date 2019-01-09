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


package chosun.ciis.en.rcpm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.rcpm.ds.*;
import chosun.ciis.en.rcpm.rec.*;

/**
 * 
 */


public class EN_RCPM_1003_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rcpm_shet_kind;
	public String rcpm_shet_no;

	public EN_RCPM_1003_SDM(){}
	public EN_RCPM_1003_SDM(String cmpy_cd, String rcpm_shet_kind, String rcpm_shet_no){
		this.cmpy_cd = cmpy_cd;
		this.rcpm_shet_kind = rcpm_shet_kind;
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRcpm_shet_kind(String rcpm_shet_kind){
		this.rcpm_shet_kind = rcpm_shet_kind;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRcpm_shet_kind(){
		return this.rcpm_shet_kind;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}

	public String getSQL(){
		 return "{ call MISENP.SP_EN_RCPM_1003_S(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_RCPM_1003_SDM dm = (EN_RCPM_1003_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rcpm_shet_kind);
		cstmt.setString(5, dm.rcpm_shet_no);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.rcpm.ds.EN_RCPM_1003_SDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("rcpm_shet_kind = " + getRcpm_shet_kind());
        System.out.println("rcpm_shet_no = " + getRcpm_shet_no());
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
String rcpm_shet_kind = req.getParameter("rcpm_shet_kind");
if( rcpm_shet_kind == null){
	System.out.println(this.toString+" : rcpm_shet_kind is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_kind is "+rcpm_shet_kind );
}
String rcpm_shet_no = req.getParameter("rcpm_shet_no");
if( rcpm_shet_no == null){
	System.out.println(this.toString+" : rcpm_shet_no is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_no is "+rcpm_shet_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rcpm_shet_kind = Util.checkString(req.getParameter("rcpm_shet_kind"));
String rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rcpm_shet_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_kind")));
String rcpm_shet_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setRcpm_shet_kind(rcpm_shet_kind);
dm.setRcpm_shet_no(rcpm_shet_no);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Feb 11 16:08:48 KST 2009 */