package chosun.ciis.hd.affr.dm;

import chosun.ciis.hd.affr.ds.HD_AFFR_9601_LDataSet;
import java.io.PrintStream;
import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.SQLException;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

public class HD_AFFR_9601_LDM extends BaseDM

  implements Serializable
{
  public String cmpy_cd;
  public String flnm;
  public String memb_clsf;
  public String expn_clsf_cd;
  public String slip_no;

  public HD_AFFR_9601_LDM()
  {

  }

  public HD_AFFR_9601_LDM(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
		System.out.println("555555555555555");
    this.cmpy_cd = paramString1;
    this.flnm = paramString2;
    this.memb_clsf = paramString3;
    this.expn_clsf_cd = paramString4;
    this.slip_no = paramString5;
  }

  public void setCmpy_cd(String paramString) {
    this.cmpy_cd = paramString;
  }

  public void setFlnm(String paramString) {
    this.flnm = paramString;
  }

  public void setMemb_clsf(String paramString) {
    this.memb_clsf = paramString;
  }
  
  public void setExpn_clsf_cd(String paramString) {
    this.expn_clsf_cd = paramString;
  }
  
  public void setSlip_no(String paramString) {
	    this.slip_no = paramString;
  }
  
  public String getCmpy_cd() {
    return this.cmpy_cd;
  }

  public String getFlnm() {
    return this.flnm;
  }

  public String getMemb_clsf() {
    return this.memb_clsf;
  }

  public String getExpn_clsf_cd() {
    return this.expn_clsf_cd;
  }
  
  public String getSlip_no() {
	    return this.slip_no;
  }
  
  public String getSQL() {
    return "{ call MISHDL.SP_HD_AFFR_9601_L(? ,? ,? ,? ,? ,? ,? ,?) }";
  }

  public void setParams(CallableStatement paramCallableStatement, BaseDM paramBaseDM) throws SQLException {
    HD_AFFR_9601_LDM localHD_AFFR_9601_LDM = (HD_AFFR_9601_LDM)paramBaseDM;
    paramCallableStatement.registerOutParameter(1, 12);
    paramCallableStatement.registerOutParameter(2, 12);
    paramCallableStatement.setString(3, localHD_AFFR_9601_LDM.cmpy_cd);
    paramCallableStatement.setString(4, localHD_AFFR_9601_LDM.flnm);
    paramCallableStatement.setString(5, localHD_AFFR_9601_LDM.memb_clsf);
    paramCallableStatement.setString(6, localHD_AFFR_9601_LDM.expn_clsf_cd);
    paramCallableStatement.setString(7, localHD_AFFR_9601_LDM.slip_no);
    paramCallableStatement.registerOutParameter(8, -10);
  }

  public BaseDataSet createDataSetObject() {
    return new HD_AFFR_9601_LDataSet();
  }

  public void print()
  {
    System.out.println("SQL = " + getSQL());
    System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
    System.out.println("flnm = [" + getFlnm() + "]");
    System.out.println("memb_clsf = [" + getMemb_clsf() + "]");
    System.out.println("expn_clsf_cd = [" + getExpn_clsf_cd() + "]");
    System.out.println("slip_no = [" + getSlip_no() + "]");
  }
}