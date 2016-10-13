/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets;

import java.util.GregorianCalendar;

import mage.cards.ExpansionSet;
import mage.constants.SetType;
import mage.constants.Rarity;
import java.util.List;
import mage.ObjectColor;
import mage.cards.CardGraphicInfo;
import mage.cards.FrameStyle;

/**
 *
 * @author North
 */
public class FallenEmpires extends ExpansionSet {

    private static final FallenEmpires fINSTANCE = new FallenEmpires();

    public static FallenEmpires getInstance() {
        return fINSTANCE;
    }

    private FallenEmpires() {
        super("Fallen Empires", "FEM", "mage.sets.fallenempires", ExpansionSet.buildDate(1994, 10, 1), SetType.EXPANSION);
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Aeolipile", 166, Rarity.RARE, mage.cards.a.Aeolipile.class));
        cards.add(new SetCardInfo("Armor Thrull", 1, Rarity.COMMON, mage.cards.a.ArmorThrull1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Armor Thrull", 2, Rarity.COMMON, mage.cards.a.ArmorThrull1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Armor Thrull", 3, Rarity.COMMON, mage.cards.a.ArmorThrull1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Armor Thrull", 4, Rarity.COMMON, mage.cards.a.ArmorThrull1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Balm of Restoration", 167, Rarity.RARE, mage.cards.b.BalmOfRestoration.class));
        cards.add(new SetCardInfo("Basal Thrull", 5, Rarity.COMMON, mage.cards.b.BasalThrull1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Basal Thrull", 6, Rarity.COMMON, mage.cards.b.BasalThrull1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Basal Thrull", 7, Rarity.COMMON, mage.cards.b.BasalThrull1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Basal Thrull", 8, Rarity.COMMON, mage.cards.b.BasalThrull1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Bottomless Vault", 177, Rarity.RARE, mage.cards.b.BottomlessVault.class));
        cards.add(new SetCardInfo("Brassclaw Orcs", 100, Rarity.COMMON, mage.cards.b.BrassclawOrcs1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Brassclaw Orcs", 101, Rarity.COMMON, mage.cards.b.BrassclawOrcs1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Brassclaw Orcs", 102, Rarity.COMMON, mage.cards.b.BrassclawOrcs1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Brassclaw Orcs", 103, Rarity.COMMON, mage.cards.b.BrassclawOrcs1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Breeding Pit", 9, Rarity.UNCOMMON, mage.cards.b.BreedingPit.class));
        cards.add(new SetCardInfo("Combat Medic", 133, Rarity.COMMON, mage.cards.c.CombatMedic1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Combat Medic", 134, Rarity.COMMON, mage.cards.c.CombatMedic1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Combat Medic", 135, Rarity.COMMON, mage.cards.c.CombatMedic1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Combat Medic", 136, Rarity.COMMON, mage.cards.c.CombatMedic1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Conch Horn", 168, Rarity.RARE, mage.cards.c.ConchHorn.class));
        cards.add(new SetCardInfo("Deep Spawn", 34, Rarity.UNCOMMON, mage.cards.d.DeepSpawn.class));
        cards.add(new SetCardInfo("Delif's Cone", 169, Rarity.COMMON, mage.cards.d.DelifsCone.class));
        cards.add(new SetCardInfo("Delif's Cube", 170, Rarity.RARE, mage.cards.d.DelifsCube.class));
        cards.add(new SetCardInfo("Derelor", 10, Rarity.RARE, mage.cards.d.Derelor.class));
        cards.add(new SetCardInfo("Draconian Cylix", 171, Rarity.RARE, mage.cards.d.DraconianCylix.class));
        cards.add(new SetCardInfo("Dwarven Armorer", 104, Rarity.RARE, mage.cards.d.DwarvenArmorer.class));
        cards.add(new SetCardInfo("Dwarven Catapult", 105, Rarity.UNCOMMON, mage.cards.d.DwarvenCatapult.class));
        cards.add(new SetCardInfo("Dwarven Hold", 178, Rarity.RARE, mage.cards.d.DwarvenHold.class));
        cards.add(new SetCardInfo("Dwarven Lieutenant", 106, Rarity.UNCOMMON, mage.cards.d.DwarvenLieutenant.class));
        cards.add(new SetCardInfo("Dwarven Ruins", 179, Rarity.UNCOMMON, mage.cards.d.DwarvenRuins.class));
        cards.add(new SetCardInfo("Dwarven Soldier", 107, Rarity.COMMON, mage.cards.d.DwarvenSoldier1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Dwarven Soldier", 108, Rarity.COMMON, mage.cards.d.DwarvenSoldier1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Dwarven Soldier", 109, Rarity.COMMON, mage.cards.d.DwarvenSoldier1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Ebon Praetor", 11, Rarity.RARE, mage.cards.e.EbonPraetor.class));
        cards.add(new SetCardInfo("Ebon Stronghold", 180, Rarity.UNCOMMON, mage.cards.e.EbonStronghold.class));
        cards.add(new SetCardInfo("Elven Fortress", 67, Rarity.COMMON, mage.cards.e.ElvenFortress1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Elven Fortress", 68, Rarity.COMMON, mage.cards.e.ElvenFortress1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Elven Fortress", 69, Rarity.COMMON, mage.cards.e.ElvenFortress1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Elven Fortress", 70, Rarity.COMMON, mage.cards.e.ElvenFortress1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Elven Lyre", 172, Rarity.RARE, mage.cards.e.ElvenLyre.class));
        cards.add(new SetCardInfo("Elvish Farmer", 71, Rarity.RARE, mage.cards.e.ElvishFarmer.class));
        cards.add(new SetCardInfo("Elvish Hunter", 72, Rarity.COMMON, mage.cards.e.ElvishHunter1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Elvish Hunter", 73, Rarity.COMMON, mage.cards.e.ElvishHunter1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Elvish Hunter", 74, Rarity.COMMON, mage.cards.e.ElvishHunter1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Elvish Scout", 75, Rarity.COMMON, mage.cards.e.ElvishScout1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Elvish Scout", 76, Rarity.COMMON, mage.cards.e.ElvishScout1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Elvish Scout", 77, Rarity.COMMON, mage.cards.e.ElvishScout1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Farrelite Priest", 137, Rarity.UNCOMMON, mage.cards.f.FarrelitePriest.class));
        cards.add(new SetCardInfo("Farrel's Mantle", 138, Rarity.UNCOMMON, mage.cards.f.FarrelsMantle.class));
        cards.add(new SetCardInfo("Farrel's Zealot", 139, Rarity.COMMON, mage.cards.f.FarrelsZealot1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Farrel's Zealot", 140, Rarity.COMMON, mage.cards.f.FarrelsZealot1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Farrel's Zealot", 141, Rarity.COMMON, mage.cards.f.FarrelsZealot1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Feral Thallid", 78, Rarity.UNCOMMON, mage.cards.f.FeralThallid.class));
        cards.add(new SetCardInfo("Fungal Bloom", 79, Rarity.RARE, mage.cards.f.FungalBloom.class));
        cards.add(new SetCardInfo("Goblin Chirurgeon", 110, Rarity.COMMON, mage.cards.g.GoblinChirurgeon1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Goblin Chirurgeon", 111, Rarity.COMMON, mage.cards.g.GoblinChirurgeon1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Goblin Chirurgeon", 112, Rarity.COMMON, mage.cards.g.GoblinChirurgeon1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Goblin Flotilla", 113, Rarity.RARE, mage.cards.g.GoblinFlotilla.class));
        cards.add(new SetCardInfo("Goblin Grenade", 114, Rarity.COMMON, mage.cards.g.GoblinGrenade1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Goblin Grenade", 115, Rarity.COMMON, mage.cards.g.GoblinGrenade1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Goblin Grenade", 116, Rarity.COMMON, mage.cards.g.GoblinGrenade1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Goblin Kites", 117, Rarity.UNCOMMON, mage.cards.g.GoblinKites.class));
        cards.add(new SetCardInfo("Goblin War Drums", 118, Rarity.COMMON, mage.cards.g.GoblinWarDrums1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Goblin War Drums", 119, Rarity.COMMON, mage.cards.g.GoblinWarDrums1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Goblin War Drums", 120, Rarity.COMMON, mage.cards.g.GoblinWarDrums1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Goblin War Drums", 121, Rarity.COMMON, mage.cards.g.GoblinWarDrums1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Goblin Warrens", 122, Rarity.RARE, mage.cards.g.GoblinWarrens.class));
        cards.add(new SetCardInfo("Hand of Justice", 142, Rarity.RARE, mage.cards.h.HandOfJustice.class));
        cards.add(new SetCardInfo("Havenwood Battleground", 181, Rarity.UNCOMMON, mage.cards.h.HavenwoodBattleground.class));
        cards.add(new SetCardInfo("High Tide", 35, Rarity.COMMON, mage.cards.h.HighTide1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("High Tide", 36, Rarity.COMMON, mage.cards.h.HighTide1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("High Tide", 37, Rarity.COMMON, mage.cards.h.HighTide1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Hollow Trees", 182, Rarity.RARE, mage.cards.h.HollowTrees.class));
        cards.add(new SetCardInfo("Homarid", 38, Rarity.COMMON, mage.cards.h.Homarid1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Homarid", 39, Rarity.COMMON, mage.cards.h.Homarid1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Homarid", 40, Rarity.COMMON, mage.cards.h.Homarid1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Homarid", 41, Rarity.COMMON, mage.cards.h.Homarid1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Homarid Shaman", 42, Rarity.RARE, mage.cards.h.HomaridShaman.class));
        cards.add(new SetCardInfo("Homarid Spawning Bed", 43, Rarity.UNCOMMON, mage.cards.h.HomaridSpawningBed.class));
        cards.add(new SetCardInfo("Homarid Warrior", 44, Rarity.COMMON, mage.cards.h.HomaridWarrior1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Homarid Warrior", 45, Rarity.COMMON, mage.cards.h.HomaridWarrior1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Homarid Warrior", 46, Rarity.COMMON, mage.cards.h.HomaridWarrior1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Hymn to Tourach", 12, Rarity.COMMON, mage.cards.h.HymnToTourach1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Hymn to Tourach", 13, Rarity.COMMON, mage.cards.h.HymnToTourach1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Hymn to Tourach", 14, Rarity.COMMON, mage.cards.h.HymnToTourach1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Hymn to Tourach", 15, Rarity.COMMON, mage.cards.h.HymnToTourach1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Icatian Javelineers", 148, Rarity.COMMON, mage.cards.i.IcatianJavelineers1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Icatian Javelineers", 149, Rarity.COMMON, mage.cards.i.IcatianJavelineers1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Icatian Javelineers", 150, Rarity.COMMON, mage.cards.i.IcatianJavelineers1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Icatian Lieutenant", 151, Rarity.RARE, mage.cards.i.IcatianLieutenant.class));
        cards.add(new SetCardInfo("Icatian Moneychanger", 152, Rarity.COMMON, mage.cards.i.IcatianMoneychanger1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Icatian Moneychanger", 153, Rarity.COMMON, mage.cards.i.IcatianMoneychanger1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Icatian Moneychanger", 154, Rarity.COMMON, mage.cards.i.IcatianMoneychanger1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Icatian Priest", 156, Rarity.UNCOMMON, mage.cards.i.IcatianPriest.class));
        cards.add(new SetCardInfo("Icatian Scout", 157, Rarity.COMMON, mage.cards.i.IcatianScout1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Icatian Scout", 158, Rarity.COMMON, mage.cards.i.IcatianScout1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Icatian Scout", 159, Rarity.COMMON, mage.cards.i.IcatianScout1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Icatian Scout", 160, Rarity.COMMON, mage.cards.i.IcatianScout1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Icatian Store", 183, Rarity.RARE, mage.cards.i.IcatianStore.class));
        cards.add(new SetCardInfo("Icatian Town", 162, Rarity.RARE, mage.cards.i.IcatianTown.class));
        cards.add(new SetCardInfo("Implements of Sacrifice", 173, Rarity.RARE, mage.cards.i.ImplementsOfSacrifice.class));
        cards.add(new SetCardInfo("Initiates of the Ebon Hand", 16, Rarity.COMMON, mage.cards.i.InitiatesOfTheEbonHand1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Initiates of the Ebon Hand", 17, Rarity.COMMON, mage.cards.i.InitiatesOfTheEbonHand1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Initiates of the Ebon Hand", 18, Rarity.COMMON, mage.cards.i.InitiatesOfTheEbonHand1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mindstab Thrull", 19, Rarity.COMMON, mage.cards.m.MindstabThrull1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mindstab Thrull", 20, Rarity.COMMON, mage.cards.m.MindstabThrull1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mindstab Thrull", 21, Rarity.COMMON, mage.cards.m.MindstabThrull1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Necrite", 22, Rarity.COMMON, mage.cards.n.Necrite1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Necrite", 23, Rarity.COMMON, mage.cards.n.Necrite1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Necrite", 24, Rarity.COMMON, mage.cards.n.Necrite1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Night Soil", 80, Rarity.COMMON, mage.cards.n.NightSoil1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Night Soil", 81, Rarity.COMMON, mage.cards.n.NightSoil1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Night Soil", 82, Rarity.COMMON, mage.cards.n.NightSoil1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Orcish Captain", 123, Rarity.UNCOMMON, mage.cards.o.OrcishCaptain.class));
        cards.add(new SetCardInfo("Orcish Spy", 124, Rarity.COMMON, mage.cards.o.OrcishSpy1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Orcish Spy", 125, Rarity.COMMON, mage.cards.o.OrcishSpy1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Orcish Spy", 126, Rarity.COMMON, mage.cards.o.OrcishSpy1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Orcish Veteran", 127, Rarity.COMMON, mage.cards.o.OrcishVeteran1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Orcish Veteran", 128, Rarity.COMMON, mage.cards.o.OrcishVeteran1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Orcish Veteran", 129, Rarity.COMMON, mage.cards.o.OrcishVeteran1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Orcish Veteran", 130, Rarity.COMMON, mage.cards.o.OrcishVeteran1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Order of Leitbur", 163, Rarity.COMMON, mage.cards.o.OrderOfLeitbur1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Order of Leitbur", 164, Rarity.COMMON, mage.cards.o.OrderOfLeitbur1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Order of Leitbur", 165, Rarity.COMMON, mage.cards.o.OrderOfLeitbur1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Order of the Ebon Hand", 25, Rarity.COMMON, mage.cards.o.OrderOfTheEbonHand1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Order of the Ebon Hand", 26, Rarity.COMMON, mage.cards.o.OrderOfTheEbonHand1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Order of the Ebon Hand", 27, Rarity.COMMON, mage.cards.o.OrderOfTheEbonHand1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Orgg", 131, Rarity.RARE, mage.cards.o.Orgg.class));
        cards.add(new SetCardInfo("Rainbow Vale", 184, Rarity.RARE, mage.cards.r.RainbowVale.class));
        cards.add(new SetCardInfo("Ring of Renewal", 174, Rarity.RARE, mage.cards.r.RingOfRenewal.class));
        cards.add(new SetCardInfo("River Merfolk", 51, Rarity.RARE, mage.cards.r.RiverMerfolk.class));
        cards.add(new SetCardInfo("Ruins of Trokair", 185, Rarity.UNCOMMON, mage.cards.r.RuinsOfTrokair.class));
        cards.add(new SetCardInfo("Sand Silos", 186, Rarity.RARE, mage.cards.s.SandSilos.class));
        cards.add(new SetCardInfo("Seasinger", 52, Rarity.UNCOMMON, mage.cards.s.Seasinger.class));
        cards.add(new SetCardInfo("Soul Exchange", 28, Rarity.UNCOMMON, mage.cards.s.SoulExchange.class));
        cards.add(new SetCardInfo("Spirit Shield", 175, Rarity.RARE, mage.cards.s.SpiritShield.class));
        cards.add(new SetCardInfo("Spore Flower", 86, Rarity.UNCOMMON, mage.cards.s.SporeFlower.class));
        cards.add(new SetCardInfo("Svyelunite Priest", 53, Rarity.UNCOMMON, mage.cards.s.SvyelunitePriest.class));
        cards.add(new SetCardInfo("Svyelunite Temple", 187, Rarity.UNCOMMON, mage.cards.s.SvyeluniteTemple.class));
        cards.add(new SetCardInfo("Thallid", 87, Rarity.COMMON, mage.cards.t.Thallid.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Thallid", 88, Rarity.COMMON, mage.cards.t.Thallid.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Thallid", 89, Rarity.COMMON, mage.cards.t.Thallid.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Thallid", 90, Rarity.COMMON, mage.cards.t.Thallid.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Thallid Devourer", 91, Rarity.UNCOMMON, mage.cards.t.ThallidDevourer.class));
        cards.add(new SetCardInfo("Thelonite Druid", 92, Rarity.UNCOMMON, mage.cards.t.TheloniteDruid.class));
        cards.add(new SetCardInfo("Thelonite Monk", 93, Rarity.RARE, mage.cards.t.TheloniteMonk.class));
        cards.add(new SetCardInfo("Thorn Thallid", 96, Rarity.COMMON, mage.cards.t.ThornThallid1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Thorn Thallid", 97, Rarity.COMMON, mage.cards.t.ThornThallid1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Thorn Thallid", 98, Rarity.COMMON, mage.cards.t.ThornThallid1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Thorn Thallid", 99, Rarity.COMMON, mage.cards.t.ThornThallid1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Thrull Champion", 29, Rarity.RARE, mage.cards.t.ThrullChampion.class));
        cards.add(new SetCardInfo("Thrull Retainer", 30, Rarity.UNCOMMON, mage.cards.t.ThrullRetainer.class));
        cards.add(new SetCardInfo("Tidal Influence", 57, Rarity.UNCOMMON, mage.cards.t.TidalInfluence.class));
        cards.add(new SetCardInfo("Vodalian Knights", 58, Rarity.RARE, mage.cards.v.VodalianKnights.class));
        cards.add(new SetCardInfo("Vodalian Mage", 59, Rarity.COMMON, mage.cards.v.VodalianMage1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Vodalian Mage", 60, Rarity.COMMON, mage.cards.v.VodalianMage1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Vodalian Mage", 61, Rarity.COMMON, mage.cards.v.VodalianMage1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Vodalian Soldiers", 62, Rarity.COMMON, mage.cards.v.VodalianSoldiers1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Vodalian Soldiers", 63, Rarity.COMMON, mage.cards.v.VodalianSoldiers1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Vodalian Soldiers", 64, Rarity.COMMON, mage.cards.v.VodalianSoldiers1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Vodalian Soldiers", 65, Rarity.COMMON, mage.cards.v.VodalianSoldiers1.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Zelyon Sword", 176, Rarity.RARE, mage.cards.z.ZelyonSword.class));
    }
}
