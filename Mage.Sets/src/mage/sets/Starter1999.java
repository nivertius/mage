/*
 * Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 *
 *    1. Redistributions of source code must retain the above copyright notice, this list of
 *       conditions and the following disclaimer.
 *
 *    2. Redistributions in binary form must reproduce the above copyright notice, this list
 *       of conditions and the following disclaimer in the documentation and/or other materials
 *       provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * The views and conclusions contained in the software and documentation are those of the
 * authors and should not be interpreted as representing official policies, either expressed
 * or implied, of BetaSteward_at_googlemail.com.
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
 * @author LevelX2
 */
public class Starter1999 extends ExpansionSet {

    private static final Starter1999 fINSTANCE = new Starter1999();

    public static Starter1999 getInstance() {
        return fINSTANCE;
    }

    private Starter1999() {
        super("Starter 1999", "S99", "mage.sets.starter1999", ExpansionSet.buildDate(1999, 7, 1), SetType.SUPPLEMENTAL);
        this.blockName = "Beginner";
        this.hasBasicLands = true;
        this.hasBoosters = true;
        this.numBoosterLands = 2;
        this.numBoosterCommon = 9;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Abyssal Horror", 63, Rarity.RARE, mage.cards.a.AbyssalHorror.class));
        cards.add(new SetCardInfo("Air Elemental", 32, Rarity.UNCOMMON, mage.cards.a.AirElemental.class));
        cards.add(new SetCardInfo("Alluring Scent", 124, Rarity.RARE, mage.cards.a.AlluringScent.class));
        cards.add(new SetCardInfo("Ancient Craving", 64, Rarity.RARE, mage.cards.a.AncientCraving.class));
        cards.add(new SetCardInfo("Angelic Blessing", 3, Rarity.COMMON, mage.cards.a.AngelicBlessing.class));
        cards.add(new SetCardInfo("Angel of Light", 1, Rarity.UNCOMMON, mage.cards.a.AngelOfLight.class));
        cards.add(new SetCardInfo("Angel of Mercy", 2, Rarity.UNCOMMON, mage.cards.a.AngelOfMercy.class));
        cards.add(new SetCardInfo("Archangel", 4, Rarity.RARE, mage.cards.a.Archangel.class));
        cards.add(new SetCardInfo("Ardent Militia", 5, Rarity.UNCOMMON, mage.cards.a.ArdentMilitia.class));
        cards.add(new SetCardInfo("Armageddon", 6, Rarity.RARE, mage.cards.a.Armageddon.class));
        cards.add(new SetCardInfo("Barbtooth Wurm", 125, Rarity.COMMON, mage.cards.b.BarbtoothWurm.class));
        cards.add(new SetCardInfo("Bargain", 7, Rarity.UNCOMMON, mage.cards.b.Bargain.class));
        cards.add(new SetCardInfo("Blinding Light", 8, Rarity.RARE, mage.cards.b.BlindingLight.class));
        cards.add(new SetCardInfo("Bog Imp", 65, Rarity.COMMON, mage.cards.b.BogImp.class));
        cards.add(new SetCardInfo("Bog Raiders", 66, Rarity.COMMON, mage.cards.b.BogRaiders.class));
        cards.add(new SetCardInfo("Bog Wraith", 67, Rarity.UNCOMMON, mage.cards.b.BogWraith.class));
        cards.add(new SetCardInfo("Border Guard", 9, Rarity.COMMON, mage.cards.b.BorderGuard.class));
        cards.add(new SetCardInfo("Breath of Life", 10, Rarity.UNCOMMON, mage.cards.b.BreathOfLife.class));
        cards.add(new SetCardInfo("Bull Hippo", 126, Rarity.UNCOMMON, mage.cards.b.BullHippo.class));
        cards.add(new SetCardInfo("Charging Paladin", 12, Rarity.UNCOMMON, mage.cards.c.ChargingPaladin.class));
        cards.add(new SetCardInfo("Chorus of Woe", 68, Rarity.COMMON, mage.cards.c.ChorusOfWoe.class));
        cards.add(new SetCardInfo("Cinder Storm", 93, Rarity.UNCOMMON, mage.cards.c.CinderStorm.class));
        cards.add(new SetCardInfo("Coercion", 69, Rarity.UNCOMMON, mage.cards.c.Coercion.class));
        cards.add(new SetCardInfo("Coral Eel", 33, Rarity.COMMON, mage.cards.c.CoralEel.class));
        cards.add(new SetCardInfo("Counterspell", 34, Rarity.UNCOMMON, mage.cards.c.Counterspell.class));
        cards.add(new SetCardInfo("Dakmor Ghoul", 70, Rarity.UNCOMMON, mage.cards.d.DakmorGhoul.class));
        cards.add(new SetCardInfo("Dakmor Lancer", 71, Rarity.RARE, mage.cards.d.DakmorLancer.class));
        cards.add(new SetCardInfo("Dakmor Plague", 72, Rarity.UNCOMMON, mage.cards.d.DakmorPlague.class));
        cards.add(new SetCardInfo("Dakmor Scorpion", 73, Rarity.COMMON, mage.cards.d.DakmorScorpion.class));
        cards.add(new SetCardInfo("Dakmor Sorceress", 74, Rarity.RARE, mage.cards.d.DakmorSorceress.class));
        cards.add(new SetCardInfo("Dark Offering", 75, Rarity.UNCOMMON, mage.cards.d.DarkOffering.class));
        cards.add(new SetCardInfo("Denizen of the Deep", 35, Rarity.RARE, mage.cards.d.DenizenOfTheDeep.class));
        cards.add(new SetCardInfo("Devastation", 94, Rarity.RARE, mage.cards.d.Devastation.class));
        cards.add(new SetCardInfo("Devoted Hero", 13, Rarity.COMMON, mage.cards.d.DevotedHero.class));
        cards.add(new SetCardInfo("Devout Monk", 14, Rarity.COMMON, mage.cards.d.DevoutMonk.class));
        cards.add(new SetCardInfo("Dread Reaper", 76, Rarity.RARE, mage.cards.d.DreadReaper.class));
        cards.add(new SetCardInfo("Durkwood Boars", 127, Rarity.COMMON, mage.cards.d.DurkwoodBoars.class));
        cards.add(new SetCardInfo("Eager Cadet", 15, Rarity.COMMON, mage.cards.e.EagerCadet.class));
        cards.add(new SetCardInfo("Earth Elemental", 95, Rarity.UNCOMMON, mage.cards.e.EarthElemental.class));
        cards.add(new SetCardInfo("Exhaustion", 36, Rarity.UNCOMMON, mage.cards.e.Exhaustion.class));
        cards.add(new SetCardInfo("Extinguish", 37, Rarity.COMMON, mage.cards.e.Extinguish.class));
        cards.add(new SetCardInfo("Eye Spy", 38, Rarity.UNCOMMON, mage.cards.e.EyeSpy.class));
        cards.add(new SetCardInfo("False Peace", 16, Rarity.UNCOMMON, mage.cards.f.FalsePeace.class));
        cards.add(new SetCardInfo("Feral Shadow", 77, Rarity.COMMON, mage.cards.f.FeralShadow.class));
        cards.add(new SetCardInfo("Fire Elemental", 96, Rarity.UNCOMMON, mage.cards.f.FireElemental.class));
        cards.add(new SetCardInfo("Fire Tempest", 97, Rarity.RARE, mage.cards.f.FireTempest.class));
        cards.add(new SetCardInfo("Foot Soldiers", 17, Rarity.COMMON, mage.cards.f.FootSoldiers.class));
        cards.add(new SetCardInfo("Forest", 170, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 171, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 172, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 173, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Gerrard's Wisdom", 18, Rarity.RARE, mage.cards.g.GerrardsWisdom.class));
        cards.add(new SetCardInfo("Giant Octopus", 39, Rarity.COMMON, mage.cards.g.GiantOctopus.class));
        cards.add(new SetCardInfo("Goblin Cavaliers", 98, Rarity.COMMON, mage.cards.g.GoblinCavaliers.class));
        cards.add(new SetCardInfo("Goblin Chariot", 99, Rarity.COMMON, mage.cards.g.GoblinChariot.class));
        cards.add(new SetCardInfo("Goblin Commando", 100, Rarity.UNCOMMON, mage.cards.g.GoblinCommando.class));
        cards.add(new SetCardInfo("Goblin General", 101, Rarity.UNCOMMON, mage.cards.g.GoblinGeneral.class));
        cards.add(new SetCardInfo("Goblin Glider", 102, Rarity.UNCOMMON, mage.cards.g.GoblinGlider.class));
        cards.add(new SetCardInfo("Goblin Hero", 103, Rarity.RARE, mage.cards.g.GoblinHero.class));
        cards.add(new SetCardInfo("Goblin Lore", 104, Rarity.UNCOMMON, mage.cards.g.GoblinLore.class));
        cards.add(new SetCardInfo("Goblin Mountaineer", 105, Rarity.COMMON, mage.cards.g.GoblinMountaineer.class));
        cards.add(new SetCardInfo("Goblin Settler", 106, Rarity.UNCOMMON, mage.cards.g.GoblinSettler.class));
        cards.add(new SetCardInfo("Gorilla Warrior", 128, Rarity.COMMON, mage.cards.g.GorillaWarrior.class));
        cards.add(new SetCardInfo("Gravedigger", 78, Rarity.UNCOMMON, mage.cards.g.Gravedigger.class));
        cards.add(new SetCardInfo("Grim Tutor", 79, Rarity.RARE, mage.cards.g.GrimTutor.class));
        cards.add(new SetCardInfo("Grizzly Bears", 129, Rarity.COMMON, mage.cards.g.GrizzlyBears.class));
        cards.add(new SetCardInfo("Hand of Death", 80, Rarity.COMMON, mage.cards.h.HandOfDeath.class));
        cards.add(new SetCardInfo("Hollow Dogs", 81, Rarity.COMMON, mage.cards.h.HollowDogs.class));
        cards.add(new SetCardInfo("Howling Fury", 82, Rarity.UNCOMMON, mage.cards.h.HowlingFury.class));
        cards.add(new SetCardInfo("Hulking Goblin", 107, Rarity.COMMON, mage.cards.h.HulkingGoblin.class));
        cards.add(new SetCardInfo("Hulking Ogre", 108, Rarity.UNCOMMON, mage.cards.h.HulkingOgre.class));
        cards.add(new SetCardInfo("Ingenious Thief", 40, Rarity.COMMON, mage.cards.i.IngeniousThief.class));
        cards.add(new SetCardInfo("Island", 158, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 159, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 160, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 161, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Jagged Lightning", 109, Rarity.UNCOMMON, mage.cards.j.JaggedLightning.class));
        cards.add(new SetCardInfo("Knight Errant", 19, Rarity.COMMON, mage.cards.k.KnightErrant.class));
        cards.add(new SetCardInfo("Last Chance", 110, Rarity.RARE, mage.cards.l.LastChance.class));
        cards.add(new SetCardInfo("Lava Axe", 111, Rarity.COMMON, mage.cards.l.LavaAxe.class));
        cards.add(new SetCardInfo("Lone Wolf", 130, Rarity.COMMON, mage.cards.l.LoneWolf.class));
        cards.add(new SetCardInfo("Loyal Sentry", 20, Rarity.RARE, mage.cards.l.LoyalSentry.class));
        cards.add(new SetCardInfo("Lynx", 131, Rarity.UNCOMMON, mage.cards.l.Lynx.class));
        cards.add(new SetCardInfo("Man-o'-War", 41, Rarity.UNCOMMON, mage.cards.m.ManOWar.class));
        cards.add(new SetCardInfo("Merfolk of the Pearl Trident", 42, Rarity.COMMON, mage.cards.m.MerfolkOfThePearlTrident.class));
        cards.add(new SetCardInfo("Mind Rot", 83, Rarity.COMMON, mage.cards.m.MindRot.class));
        cards.add(new SetCardInfo("Mons's Goblin Raiders", 112, Rarity.RARE, mage.cards.m.MonssGoblinRaiders.class));
        cards.add(new SetCardInfo("Monstrous Growth", 132, Rarity.COMMON, mage.cards.m.MonstrousGrowth.class));
        cards.add(new SetCardInfo("Moon Sprite", 133, Rarity.UNCOMMON, mage.cards.m.MoonSprite.class));
        cards.add(new SetCardInfo("Mountain", 166, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 167, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 168, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 169, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Muck Rats", 84, Rarity.COMMON, mage.cards.m.MuckRats.class));
        cards.add(new SetCardInfo("Natural Spring", 134, Rarity.UNCOMMON, mage.cards.n.NaturalSpring.class));
        cards.add(new SetCardInfo("Nature's Cloak", 135, Rarity.RARE, mage.cards.n.NaturesCloak.class));
        cards.add(new SetCardInfo("Nature's Lore", 136, Rarity.COMMON, mage.cards.n.NaturesLore.class));
        cards.add(new SetCardInfo("Norwood Archers", 137, Rarity.COMMON, mage.cards.n.NorwoodArchers.class));
        cards.add(new SetCardInfo("Norwood Ranger", 138, Rarity.COMMON, mage.cards.n.NorwoodRanger.class));
        cards.add(new SetCardInfo("Ogre Warrior", 113, Rarity.COMMON, mage.cards.o.OgreWarrior.class));
        cards.add(new SetCardInfo("Phantom Warrior", 44, Rarity.RARE, mage.cards.p.PhantomWarrior.class));
        cards.add(new SetCardInfo("Plains", 154, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 155, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 156, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 157, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Pride of Lions", 139, Rarity.UNCOMMON, mage.cards.p.PrideOfLions.class));
        cards.add(new SetCardInfo("Psychic Transfer", 46, Rarity.RARE, mage.cards.p.PsychicTransfer.class));
        cards.add(new SetCardInfo("Raging Goblin", 114, Rarity.COMMON, mage.cards.r.RagingGoblin.class));
        cards.add(new SetCardInfo("Raise Dead", 85, Rarity.COMMON, mage.cards.r.RaiseDead.class));
        cards.add(new SetCardInfo("Ravenous Rats", 86, Rarity.UNCOMMON, mage.cards.r.RavenousRats.class));
        cards.add(new SetCardInfo("Relearn", 48, Rarity.UNCOMMON, mage.cards.r.Relearn.class));
        cards.add(new SetCardInfo("Relentless Assault", 115, Rarity.RARE, mage.cards.r.RelentlessAssault.class));
        cards.add(new SetCardInfo("Remove Soul", 49, Rarity.COMMON, mage.cards.r.RemoveSoul.class));
        cards.add(new SetCardInfo("Righteous Charge", 22, Rarity.UNCOMMON, mage.cards.r.RighteousCharge.class));
        cards.add(new SetCardInfo("Righteous Fury", 23, Rarity.RARE, mage.cards.r.RighteousFury.class));
        cards.add(new SetCardInfo("Royal Falcon", 24, Rarity.COMMON, mage.cards.r.RoyalFalcon.class));
        cards.add(new SetCardInfo("Royal Trooper", 25, Rarity.UNCOMMON, mage.cards.r.RoyalTrooper.class));
        cards.add(new SetCardInfo("Sacred Nectar", 26, Rarity.COMMON, mage.cards.s.SacredNectar.class));
        cards.add(new SetCardInfo("Scathe Zombies", 87, Rarity.COMMON, mage.cards.s.ScatheZombies.class));
        cards.add(new SetCardInfo("Scorching Spear", 116, Rarity.COMMON, mage.cards.s.ScorchingSpear.class));
        cards.add(new SetCardInfo("Sea Eagle", 50, Rarity.COMMON, mage.cards.s.SeaEagle.class));
        cards.add(new SetCardInfo("Serpent Warrior", 88, Rarity.COMMON, mage.cards.s.SerpentWarrior.class));
        cards.add(new SetCardInfo("Shrieking Specter", 89, Rarity.UNCOMMON, mage.cards.s.ShriekingSpecter.class));
        cards.add(new SetCardInfo("Silverback Ape", 141, Rarity.UNCOMMON, mage.cards.s.SilverbackApe.class));
        cards.add(new SetCardInfo("Sleight of Hand", 51, Rarity.COMMON, mage.cards.s.SleightOfHand.class));
        cards.add(new SetCardInfo("Snapping Drake", 52, Rarity.COMMON, mage.cards.s.SnappingDrake.class));
        cards.add(new SetCardInfo("Soul Feast", 90, Rarity.UNCOMMON, mage.cards.s.SoulFeast.class));
        cards.add(new SetCardInfo("Southern Elephant", 142, Rarity.COMMON, mage.cards.s.SouthernElephant.class));
        cards.add(new SetCardInfo("Spitting Earth", 117, Rarity.UNCOMMON, mage.cards.s.SpittingEarth.class));
        cards.add(new SetCardInfo("Squall", 143, Rarity.COMMON, mage.cards.s.Squall.class));
        cards.add(new SetCardInfo("Steadfastness", 27, Rarity.COMMON, mage.cards.s.Steadfastness.class));
        cards.add(new SetCardInfo("Stone Rain", 118, Rarity.COMMON, mage.cards.s.StoneRain.class));
        cards.add(new SetCardInfo("Storm Crow", 53, Rarity.COMMON, mage.cards.s.StormCrow.class));
        cards.add(new SetCardInfo("Stream of Acid", 91, Rarity.UNCOMMON, mage.cards.s.StreamOfAcid.class));
        cards.add(new SetCardInfo("Summer Bloom", 144, Rarity.RARE, mage.cards.s.SummerBloom.class));
        cards.add(new SetCardInfo("Swamp", 162, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 163, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 164, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 165, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Sylvan Basilisk", 145, Rarity.RARE, mage.cards.s.SylvanBasilisk.class));
        cards.add(new SetCardInfo("Sylvan Yeti", 146, Rarity.RARE, mage.cards.s.SylvanYeti.class));
        cards.add(new SetCardInfo("Thorn Elemental", 147, Rarity.RARE, mage.cards.t.ThornElemental.class));
        cards.add(new SetCardInfo("Thunder Dragon", 119, Rarity.RARE, mage.cards.t.ThunderDragon.class));
        cards.add(new SetCardInfo("Tidings", 54, Rarity.UNCOMMON, mage.cards.t.Tidings.class));
        cards.add(new SetCardInfo("Time Ebb", 55, Rarity.COMMON, mage.cards.t.TimeEbb.class));
        cards.add(new SetCardInfo("Time Warp", 56, Rarity.RARE, mage.cards.t.TimeWarp.class));
        cards.add(new SetCardInfo("Touch of Brilliance", 57, Rarity.COMMON, mage.cards.t.TouchOfBrilliance.class));
        cards.add(new SetCardInfo("Trained Orgg", 120, Rarity.RARE, mage.cards.t.TrainedOrgg.class));
        cards.add(new SetCardInfo("Tremor", 121, Rarity.COMMON, mage.cards.t.Tremor.class));
        cards.add(new SetCardInfo("Undo", 58, Rarity.UNCOMMON, mage.cards.u.Undo.class));
        cards.add(new SetCardInfo("Untamed Wilds", 148, Rarity.UNCOMMON, mage.cards.u.UntamedWilds.class));
        cards.add(new SetCardInfo("Venerable Monk", 28, Rarity.COMMON, mage.cards.v.VenerableMonk.class));
        cards.add(new SetCardInfo("Vengeance", 29, Rarity.UNCOMMON, mage.cards.v.Vengeance.class));
        cards.add(new SetCardInfo("Veteran Cavalier", 30, Rarity.UNCOMMON, mage.cards.v.VeteranCavalier.class));
        cards.add(new SetCardInfo("Vizzerdrix", 59, Rarity.RARE, mage.cards.v.Vizzerdrix.class));
        cards.add(new SetCardInfo("Volcanic Dragon", 122, Rarity.RARE, mage.cards.v.VolcanicDragon.class));
        cards.add(new SetCardInfo("Volcanic Hammer", 123, Rarity.COMMON, mage.cards.v.VolcanicHammer.class));
        cards.add(new SetCardInfo("Water Elemental", 60, Rarity.UNCOMMON, mage.cards.w.WaterElemental.class));
        cards.add(new SetCardInfo("Whiptail Wurm", 149, Rarity.UNCOMMON, mage.cards.w.WhiptailWurm.class));
        cards.add(new SetCardInfo("Whirlwind", 150, Rarity.RARE, mage.cards.w.Whirlwind.class));
        cards.add(new SetCardInfo("Wicked Pact", 92, Rarity.RARE, mage.cards.w.WickedPact.class));
        cards.add(new SetCardInfo("Wild Griffin", 31, Rarity.COMMON, mage.cards.w.WildGriffin.class));
        cards.add(new SetCardInfo("Wild Ox", 151, Rarity.UNCOMMON, mage.cards.w.WildOx.class));
        cards.add(new SetCardInfo("Willow Elf", 152, Rarity.COMMON, mage.cards.w.WillowElf.class));
        cards.add(new SetCardInfo("Wind Drake", 61, Rarity.COMMON, mage.cards.w.WindDrake.class));
        cards.add(new SetCardInfo("Wind Sail", 62, Rarity.UNCOMMON, mage.cards.w.WindSail.class));
        cards.add(new SetCardInfo("Wood Elves", 153, Rarity.UNCOMMON, mage.cards.w.WoodElves.class));
    }
}