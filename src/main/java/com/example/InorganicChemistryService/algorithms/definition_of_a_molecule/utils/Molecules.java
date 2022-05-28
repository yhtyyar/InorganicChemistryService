package com.example.InorganicChemistryService.algorithms.definition_of_a_molecule.utils;

import java.util.HashMap;

public enum Molecules {

    // Simple substances
    H2,                            HE,

    LI, BE,  B,  C,  N2,  O2,  F2, NE,

    NA, MG, AL, SI,   P,   S, CL2, AR,

    K,  CA, SC, TI,   V,  CR,  MN, FE, CO, NI,
    CU, ZN, GA, GE,  AS,  SE, BR2, KR,

    RB, SR,  Y, ZR,  NB,  MO,  TC, RU, RH, PD,
    AG, CD, IN, SN,  SB,  TE,  I2, XE,

    CS, BA, LA, HF,  TA,   W,  RE, OS, IR, PT,
    AU, HG, TL, PB,  BI,  PO,  AT, RN,

    FR, RA, AC, RF,  DB,  SG,  BH, HS, MT, DS,
    RG, CN,


    CE, PR, ND, PM, SM, EU, GD, TB, DY, HO, ER, TM, YB, LU,
    TH, PA,  U, NP, PU, AM, CM, BK, CF, ES, FM, MD, NO, LR,


    // Complex substances

    // Metal oxides
    LI2O,   NA2O, K2O, RB2O, CS2O, FR2O,
    BEO,     MGO, CAO, SR2O, BA2O, RA2O,
    AL2O3, SC2O3,
    TIO2,
    V2O5,
    CRO3,
    MN2O7,



    // Non-metal oxides
    H2O,

    B2O3,
   // есть проблема с угарным газом и кобальтом CO или Co
    CO2,


    // Acids, 2 molecules
    HCL,
    HBR,
    HI,


    // Acids, 3 molecules
    H2SO4,
    H2SO3,
    H2S;





    HashMap<String, Float> molecularWeight = new HashMap<>();

    public void fillingMolecularWeightHasMap() {

        // Simple substances

        molecularWeight.put(H2.name(),    2.0f);
        molecularWeight.put(HE.name(),    4.0f);
        molecularWeight.put(LI.name(),    7.0f);
        molecularWeight.put(BE.name(),    9.0f);
        molecularWeight.put(B.name(),    11.0f);
        molecularWeight.put(C.name(),    12.0f);
        molecularWeight.put(N2.name(),   28.0f);
        molecularWeight.put(O2.name(),   32.0f);
        molecularWeight.put(F2.name(),   38.0f);
        molecularWeight.put(NE.name(),   20.0f);
        molecularWeight.put(NA.name(),   23.0f);
        molecularWeight.put(MG.name(),   24.0f);
        molecularWeight.put(AL.name(),   27.0f);
        molecularWeight.put(SI.name(),   28.0f);
        molecularWeight.put(P.name(),    31.0f);
        molecularWeight.put(S.name(),    32.0f);
        molecularWeight.put(CL2.name(),  71.0f);
        molecularWeight.put(AR.name(),   40.0f);
        molecularWeight.put(K.name(),    39.0f);
        molecularWeight.put(CA.name(),   40.0f);
        molecularWeight.put(SC.name(),   45.0f);
        molecularWeight.put(TI.name(),   48.0f);
        molecularWeight.put(V.name(),    51.0f);
        molecularWeight.put(CR.name(),   52.0f);
        molecularWeight.put(MN.name(),   55.0f);
        molecularWeight.put(FE.name(),   56.0f);
        molecularWeight.put(CO.name(),   59.0f);
        molecularWeight.put(NI.name(),   59.0f);
        molecularWeight.put(CU.name(),   64.0f);
        molecularWeight.put(ZN.name(),   65.0f);
        molecularWeight.put(GA.name(),   70.0f);
        molecularWeight.put(GE.name(),   73.0f);
        molecularWeight.put(AS.name(),   75.0f);
        molecularWeight.put(SE.name(),   79.0f);
        molecularWeight.put(BR2.name(), 160.0f);
        molecularWeight.put(KR.name(),   84.0f);
        molecularWeight.put(RB.name(),   86.0f);
        molecularWeight.put(SR.name(),   88.0f);
        molecularWeight.put(Y.name(),    89.0f);
        molecularWeight.put(ZR.name(),   91.0f);
        molecularWeight.put(NB.name(),   93.0f);
        molecularWeight.put(MO.name(),   96.0f);
        molecularWeight.put(TC.name(),   98.0f);
        molecularWeight.put(RU.name(),  101.0f);
        molecularWeight.put(RH.name(),  103.0f);
        molecularWeight.put(PD.name(),  106.0f);
        molecularWeight.put(AG.name(),  108.0f);
        molecularWeight.put(CD.name(),  112.0f);
        molecularWeight.put(IN.name(),  115.0f);
        molecularWeight.put(SN.name(),  119.0f);
        molecularWeight.put(SB.name(),  122.0f);
        molecularWeight.put(TE.name(),  128.0f);
        molecularWeight.put(I2.name(),  254.0f);
        molecularWeight.put(XE.name(),  131.0f);
        molecularWeight.put(CS.name(),  133.0f);
        molecularWeight.put(BA.name(),  137.0f);
        molecularWeight.put(LA.name(),  139.0f);
        molecularWeight.put(CE.name(),  140.0f);
        molecularWeight.put(PR.name(),  141.0f);
        molecularWeight.put(ND.name(),  144.0f);
        molecularWeight.put(PM.name(),  145.0f);
        molecularWeight.put(SM.name(),  150.0f);
        molecularWeight.put(EU.name(),  152.0f);
        molecularWeight.put(GD.name(),  157.0f);
        molecularWeight.put(TB.name(),  159.0f);
        molecularWeight.put(DY.name(),  163.0f);
        molecularWeight.put(HO.name(),  165.0f);
        molecularWeight.put(ER.name(),  167.0f);
        molecularWeight.put(TM.name(),  169.0f);
        molecularWeight.put(YB.name(),  173.0f);
        molecularWeight.put(LU.name(),  175.0f);
        molecularWeight.put(HF.name(),  179.0f);
        molecularWeight.put(TA.name(),  181.0f);
        molecularWeight.put(W.name(),   184.0f);
        molecularWeight.put(RE.name(),  186.0f);
        molecularWeight.put(OS.name(),  190.0f);
        molecularWeight.put(IR.name(),  192.0f);
        molecularWeight.put(PT.name(),  195.0f);
        molecularWeight.put(AU.name(),  197.0f);
        molecularWeight.put(HG.name(),  201.0f);
        molecularWeight.put(TL.name(),  204.0f);
        molecularWeight.put(PB.name(),  207.0f);
        molecularWeight.put(BI.name(),  209.0f);
        molecularWeight.put(PO.name(),  209.0f);
        molecularWeight.put(AT.name(),  210.0f);
        molecularWeight.put(RN.name(),  222.0f);
        molecularWeight.put(FR.name(),  223.0f);
        molecularWeight.put(RA.name(),  226.0f);
        molecularWeight.put(AC.name(),  227.0f);
        molecularWeight.put(TH.name(),  232.0f);
        molecularWeight.put(PA.name(),  231.0f);
        molecularWeight.put(U.name(),   238.0f);
        molecularWeight.put(NP.name(),  237.0f);
        molecularWeight.put(PU.name(),  244.0f);
        molecularWeight.put(AM.name(),  243.0f);
        molecularWeight.put(CM.name(),  247.0f);
        molecularWeight.put(BK.name(),  247.0f);
        molecularWeight.put(CF.name(),  251.0f);
        molecularWeight.put(ES.name(),  252.0f);
        molecularWeight.put(FM.name(),  257.0f);
        molecularWeight.put(MD.name(),  258.0f);
        molecularWeight.put(NO.name(),  259.0f);
        molecularWeight.put(LR.name(),  262.0f);
        molecularWeight.put(RF.name(),  265.0f);
        molecularWeight.put(DB.name(),  268.0f);
        molecularWeight.put(SG.name(),  271.0f);
        molecularWeight.put(BH.name(),  267.0f);
        molecularWeight.put(HS.name(),  269.0f);
        molecularWeight.put(MT.name(),  278.0f);
        molecularWeight.put(DS.name(),  281.0f);
        molecularWeight.put(RG.name(),  281.0f);
        molecularWeight.put(CN.name(),  285.0f);



        // Complex substances



    }
}
