package com.example.InorganicChemistryService.algorithms.definition_of_a_molecule.utils;

import java.util.HashMap;

public enum Atoms {

     H,                            HE,
    LI, BE,  B,  C,   N,   O,  F,  NE,
    NA, MG, AL, SI,   P,   S,  CL, AR,
    K,  CA, SC, TI,   V,  CR,  MN, FE, CO, NI,
    CU, ZN, GA, GE,  AS,  SE,  BR, KR,
    RB, SR,  Y, ZR,  NB,  MO,  TC, RU, RH, PD,
    AG, CD, IN, SN,  SB,  TE,   I, XE,
    CS, BA, LA, HF,  TA,   W,  RE, OS, IR, PT,
    AU, HG, TL, PB,  BI,  PO,  AT, RN,
    FR, RA, AC, RF,  DB,  SG,  BH, HS, MT, DS,
    RG, CN,


    CE, PR, ND, PM, SM, EU, GD, TB, DY, HO, ER, TM, YB, LU,
    TH, PA,  U, NP, PU, AM, CM, BK, CF, ES, FM, MD, NO, LR;


    HashMap<String, Float> atomsWeight = new HashMap<>();

    public void fillingAtomsWeightHasMap() {

        // Simple substances

        atomsWeight.put(H.name(),     1.0f);
        atomsWeight.put(HE.name(),    4.0f);
        atomsWeight.put(LI.name(),    7.0f);
        atomsWeight.put(BE.name(),    9.0f);
        atomsWeight.put(B.name(),    11.0f);
        atomsWeight.put(C.name(),    12.0f);
        atomsWeight.put(N.name(),    14.0f);
        atomsWeight.put(O.name(),    16.0f);
        atomsWeight.put(F.name(),    19.0f);
        atomsWeight.put(NE.name(),   20.0f);
        atomsWeight.put(NA.name(),   23.0f);
        atomsWeight.put(MG.name(),   24.0f);
        atomsWeight.put(AL.name(),   27.0f);
        atomsWeight.put(SI.name(),   28.0f);
        atomsWeight.put(P.name(),    31.0f);
        atomsWeight.put(S.name(),    32.0f);
        atomsWeight.put(CL.name(),   35.5f);
        atomsWeight.put(AR.name(),   40.0f);
        atomsWeight.put(K.name(),    39.0f);
        atomsWeight.put(CA.name(),   40.0f);
        atomsWeight.put(SC.name(),   45.0f);
        atomsWeight.put(TI.name(),   48.0f);
        atomsWeight.put(V.name(),    51.0f);
        atomsWeight.put(CR.name(),   52.0f);
        atomsWeight.put(MN.name(),   55.0f);
        atomsWeight.put(FE.name(),   56.0f);
        atomsWeight.put(CO.name(),   59.0f);
        atomsWeight.put(NI.name(),   59.0f);
        atomsWeight.put(CU.name(),   64.0f);
        atomsWeight.put(ZN.name(),   65.0f);
        atomsWeight.put(GA.name(),   70.0f);
        atomsWeight.put(GE.name(),   73.0f);
        atomsWeight.put(AS.name(),   75.0f);
        atomsWeight.put(SE.name(),   79.0f);
        atomsWeight.put(BR.name(),   80.0f);
        atomsWeight.put(KR.name(),   84.0f);
        atomsWeight.put(RB.name(),   86.0f);
        atomsWeight.put(SR.name(),   88.0f);
        atomsWeight.put(Y.name(),    89.0f);
        atomsWeight.put(ZR.name(),   91.0f);
        atomsWeight.put(NB.name(),   93.0f);
        atomsWeight.put(MO.name(),   96.0f);
        atomsWeight.put(TC.name(),   98.0f);
        atomsWeight.put(RU.name(),  101.0f);
        atomsWeight.put(RH.name(),  103.0f);
        atomsWeight.put(PD.name(),  106.0f);
        atomsWeight.put(AG.name(),  108.0f);
        atomsWeight.put(CD.name(),  112.0f);
        atomsWeight.put(IN.name(),  115.0f);
        atomsWeight.put(SN.name(),  119.0f);
        atomsWeight.put(SB.name(),  122.0f);
        atomsWeight.put(TE.name(),  128.0f);
        atomsWeight.put(I.name(),   127.0f);
        atomsWeight.put(XE.name(),  131.0f);
        atomsWeight.put(CS.name(),  133.0f);
        atomsWeight.put(BA.name(),  137.0f);
        atomsWeight.put(LA.name(),  139.0f);
        atomsWeight.put(CE.name(),  140.0f);
        atomsWeight.put(PR.name(),  141.0f);
        atomsWeight.put(ND.name(),  144.0f);
        atomsWeight.put(PM.name(),  145.0f);
        atomsWeight.put(SM.name(),  150.0f);
        atomsWeight.put(EU.name(),  152.0f);
        atomsWeight.put(GD.name(),  157.0f);
        atomsWeight.put(TB.name(),  159.0f);
        atomsWeight.put(DY.name(),  163.0f);
        atomsWeight.put(HO.name(),  165.0f);
        atomsWeight.put(ER.name(),  167.0f);
        atomsWeight.put(TM.name(),  169.0f);
        atomsWeight.put(YB.name(),  173.0f);
        atomsWeight.put(LU.name(),  175.0f);
        atomsWeight.put(HF.name(),  179.0f);
        atomsWeight.put(TA.name(),  181.0f);
        atomsWeight.put(W.name(),   184.0f);
        atomsWeight.put(RE.name(),  186.0f);
        atomsWeight.put(OS.name(),  190.0f);
        atomsWeight.put(IR.name(),  192.0f);
        atomsWeight.put(PT.name(),  195.0f);
        atomsWeight.put(AU.name(),  197.0f);
        atomsWeight.put(HG.name(),  201.0f);
        atomsWeight.put(TL.name(),  204.0f);
        atomsWeight.put(PB.name(),  207.0f);
        atomsWeight.put(BI.name(),  209.0f);
        atomsWeight.put(PO.name(),  209.0f);
        atomsWeight.put(AT.name(),  210.0f);
        atomsWeight.put(RN.name(),  222.0f);
        atomsWeight.put(FR.name(),  223.0f);
        atomsWeight.put(RA.name(),  226.0f);
        atomsWeight.put(AC.name(),  227.0f);
        atomsWeight.put(TH.name(),  232.0f);
        atomsWeight.put(PA.name(),  231.0f);
        atomsWeight.put(U.name(),   238.0f);
        atomsWeight.put(NP.name(),  237.0f);
        atomsWeight.put(PU.name(),  244.0f);
        atomsWeight.put(AM.name(),  243.0f);
        atomsWeight.put(CM.name(),  247.0f);
        atomsWeight.put(BK.name(),  247.0f);
        atomsWeight.put(CF.name(),  251.0f);
        atomsWeight.put(ES.name(),  252.0f);
        atomsWeight.put(FM.name(),  257.0f);
        atomsWeight.put(MD.name(),  258.0f);
        atomsWeight.put(NO.name(),  259.0f);
        atomsWeight.put(LR.name(),  262.0f);
        atomsWeight.put(RF.name(),  265.0f);
        atomsWeight.put(DB.name(),  268.0f);
        atomsWeight.put(SG.name(),  271.0f);
        atomsWeight.put(BH.name(),  267.0f);
        atomsWeight.put(HS.name(),  269.0f);
        atomsWeight.put(MT.name(),  278.0f);
        atomsWeight.put(DS.name(),  281.0f);
        atomsWeight.put(RG.name(),  281.0f);
        atomsWeight.put(CN.name(),  285.0f);



        // Complex substances



    }
}
